package icst2020.prefest2espresso;

import java.io.*;

public class Main {

    private static final char QUOTE = '\'';
    private static final char SEMICOLON = ':';
    private static final String CLOSE_BRACE= "}";
    private static final String OPEN_TEST= "# testcase";
    private static final String CLOSE_TEST= "except Exception, e:";

    private static final String INDENT = "    ";

    private String source;
    private String destinationDir;

    private String appPackage;
    private String appActivity;

    private int lineNumber = 0;

    StringBuffer test;

    public static void main(String[] args) throws IOException {
        if (args.length<2){
            System.err.println("Wrong number of arguments. USAGE: ");
            System.err.println(Main.class.getName() + "PREFEST_TEST OUT_DIR");
            System.err.println("   PREFEST_TEST: python test case generated with PreFest");
            System.err.println("   OUT_DIR: folder where to start the package structure of Espresso test(s)");
            System.exit(1);
        }
        Main worker = new Main();
        worker.setSource(args[0]);
        worker.setDestinationDir(args[1]);
        worker.translate();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestinationDir(String destinationDir) {
        this.destinationDir = destinationDir;
    }

    public void translate() throws IOException {
        test = new StringBuffer(1000);
        BufferedReader in = new BufferedReader(new FileReader(source));
        readSettings(in);
        readTest(in);
        writeTest();
    }


    private void readSettings(BufferedReader in) throws IOException {
        String line = null;
        while ((line=in.readLine())!=null){
            lineNumber++;
            if (line.contains("appPackage")) {
                String value = line.substring(line.indexOf(SEMICOLON)+1);
                value = value.substring(value.indexOf(QUOTE)+1, value.lastIndexOf(QUOTE));
                appPackage = value;
                continue;
            }
            if (line.contains("appActivity")){
                String value = line.substring(line.indexOf(SEMICOLON)+1);
                value = value.substring(value.indexOf(QUOTE)+1, value.lastIndexOf(QUOTE));
                appActivity = value;
                continue;
            }
            if (line.contains(CLOSE_BRACE))
                break;
        }
    }


    private void readTest(BufferedReader in) throws IOException {
        //test instrumentation
        test.append(INDENT+INDENT);
        test.append("long testStartTime = System.currentTimeMillis();\n\n");

        String line;
        while ((line=in.readLine())!=null){
            lineNumber++;
            if (line.contains(OPEN_TEST))
                break;
        }
        while ((line=in.readLine())!=null){
            lineNumber++;
            //System.out.println(line);
            if (line.contains(CLOSE_TEST))
                break;
            if (line.contains("starttime = time.time") || line.contains("driver = webdriver.Remote") || line.contains("try :")) //some more initializations
                continue;
            if (line.contains("driver.press_keycode") ) { //key pressed event
                keyPressedEvent(line);
                continue;
            }
            if (line.contains("new UiSelector().text")) { // view by text
                viewByText(line);
                continue;
            }
            if (line.contains("new UiSelector().resourceId")) { // view by id
                viewById(line);
                continue;
            }
            if (line.contains("ew UiSelector().className(") && line.contains(").description(")) { // view by description
                viewByDescription(line);
                continue;
            }
            if (line.contains("TouchAction(driver).tap(element).perform()")) { // touch event
                touchEvent(line);
                continue;
            }
            if (line.contains("TouchAction(driver).long_press(element).release().perform()")) { // long-touch event
                longTouchEvent(line);
                continue;
            }
            if (line.contains("element.send_keys(")) { // type event
                typeEvent(line);
                continue;
            }
            if (line.contains("element.clear()")) { // clear event
                clearEvent(line);
                continue;
            }
            if (line.contains("swipe(driver")) { //  swipe event
                swipeEvent(line);
                continue;
            }
            //if (line.contains("new UiSelector().className(\\\"android.widget.ImageView\\\").instance(")) { //  root view
            if (line.matches("\\s*element = getElememt\\(driver, \"new UiSelector\\(\\)\\.className\\(\\\\\"[\\w\\.]+\\\\\"\\)\\.instance\\(\\d+\\)\"\\)\\s*")) { //  root view with instance index
                viewByClassName(line);
                continue;
            }
            if (line.matches("\\s*element = getElememt\\(driver, \"new UiSelector\\(\\)\\.className\\(\\\\\"[\\w\\.]+\\\\\"\\)\"\\)\\s*")) { //  root view with not instance index
                viewByClassName(line);
                continue;
            }
            throw new InternalError("Error in converting file: [" + this.source + "]\n"+
                    "line: [" +lineNumber + "]\n" +
                    "Translation of statement not implemented: [" +line +"]");
        }
        instrumentEnd(2);
    }

    private void instrumentEnd(int indents){
        for (int i=0;i<indents;i++) test.append(INDENT);
        test.append("long testFinishTime = System.currentTimeMillis();\n");
        for (int i=0;i<indents;i++) test.append(INDENT);
        test.append("Log.d(\"IN-VIVO\", \"Test: \"+ getClass().getName()+\", duration: \" + ((testFinishTime-testStartTime)) + \" ms\");\n");
        
        test.append("\t // TimePrinter.getInstance().log(\"\" + getClass().getName() + \", \" + (testFinishTime-testStartTime));\n");

    }

    private void keyPressedEvent(String line) {
        String value = line.substring(line.indexOf('(')+1, line.indexOf(')'));
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        if ("4".compareTo(value)==0){
            test.append(INDENT + INDENT);
            test.append("try{onView(isRoot()).perform(pressKey(" + value + "));}\n");
            test.append(INDENT + INDENT);
            test.append("//hitting BACK button may have caused the activity to exit\n");
            test.append(INDENT + INDENT);
            test.append("catch(NoActivityResumedException e){\n");
            instrumentEnd(3);
            test.append(""+ INDENT + INDENT+ INDENT + "return;\n"+INDENT + INDENT+"};\n");
        }
        else {
            test.append(INDENT + INDENT);
            test.append("onView(isRoot()).perform(pressKey(" + value + "));\n");

        }
        test.append(INDENT + INDENT);
        test.append("Thread.sleep(1000);\n\n");
    }

    private void viewByText(String line) {
        int start = line.indexOf("\\\"");
        int end = line.indexOf("\\\"", start +1);
        String value = line.substring(start+1+1, end);
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        test.append("last = onView(withIndex(withText(\"" + value + "\"), 0));\n\n");
        //test.append("last = onView(withText(\"" + value + "\"));\n\n");
    }

    private void viewById(String line) {
        int start = line.indexOf("\\\"");
        int end = line.indexOf("\\\"", start +1);
        String value = line.substring(start+1+1, end);
        value = value.replace(":", ".R.").replace('/', '.');
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        test.append("last = onView(withIndex(withId(" + value + "), 0));");
        test.append("\n\n");
        //test.append("last = onView(withId(" + value + "));\n\n");
    }

    private void viewByDescription(String line) {
        int from = line.indexOf(").description(");
        int start = line.indexOf("\\\"", from);
        int end = line.indexOf("\\\"", start +1);
        String value = line.substring(start+1+1, end);
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        test.append("last = onView(withIndex(withContentDescription(\"" + value + "\"), 0));");
        test.append("\n\n");
        //test.append("last = onView(withContentDescription(\"" + value + "\"));\n\n");
    }

    private void touchEvent(String line) {
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        //test.append("last = last.perform(scrollTo());\n\n");
        // why was it duplicated?
        //test.append(inTryBlock("last = last.perform(click());\n\n"));
        test.append(inTryBlock("last = last.perform(click());"));
        test.append("\n\n");
    }

    private void longTouchEvent(String line) {
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        //test.append("last = last.perform(longClick());\n\n");
        //test.append("last = last.perform(scrollTo());\n\n");
        test.append(inTryBlock("last = last.perform(click());"));
        test.append("\n\n");
    }

    private void typeEvent(String line) {
        int start = line.indexOf("\"");
        int end = line.indexOf("\"", start +1);
        String value = line.substring(start, end+1);
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        test.append("last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));\n");
        test.append(INDENT+INDENT);
        test.append(inTryBlock("last = last.perform(typeText(" + value + "));"));
        test.append("\n\n");
    }

    private void clearEvent(String line) {
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        test.append(INDENT+INDENT);
        test.append("last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));\n");
        test.append(INDENT+INDENT);
        test.append(inTryBlock("last = last.perform(clearText());"));
        test.append("\n\n");

    }

    private void swipeEvent(String line) {
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        //test.append(INDENT+INDENT);
        //test.append("last = onView(isRoot()).perform(swipeUp());\n");
        test.append(INDENT+INDENT);
        //test.append("last = last.perform(scrollTo());\n\n");
        test.append(inTryBlock("last = onView(isRoot()).perform(click());"));
        test.append("\n\n");
    }

    private void viewByClassName(String line) {
        test.append(INDENT+INDENT);
        test.append("// " + line + "\n");
        int start = line.indexOf("\\\"");
        int finish = line.indexOf("\\\"", start+1);
        String className = line.substring(start+2, finish);
        test.append(INDENT+INDENT);
        //test.append("last = onView(withIndex(isRoot(),0));\n\n");
        //test.append("last = onView(withIndex(withClassName(is(\"" + className + "\")),0));");
        test.append("last = onView(withIndex(allOf(isDisplayed(), isAssignableFrom("+className+".class)),0));");
        test.append("\n\n");
    }

    private String inTryBlock(String statement){
        return "try{ " + statement + " }\n" +
                INDENT+INDENT+
                "catch(NoMatchingViewException e1){System.err.println(\"Element not found, skipping event\");}\n" +
                INDENT+INDENT+
                "catch(PerformException e2){System.err.println(\"Element partially hidden, skipping event\");};";
    }

    private void writeTest() throws IOException{

        String thePackage = appActivity.substring(0, appActivity.lastIndexOf('.'));

        String packageDir = thePackage.replaceAll("\\.", File.separator);
        File outFileDir = new File(destinationDir + File.separator + packageDir + File.separator);
        outFileDir.mkdirs();

        File reading = new File(source);
        String fileName = reading.getName();
        String testName = fileName.substring(0, fileName.lastIndexOf(".py"));

        File outFile = new File(outFileDir, testName + ".java");
        PrintWriter out = new PrintWriter(outFile);//destinationDir

        out.print("package " + thePackage + ";\n\n");

//        out.print("import android.support.test.espresso.ViewInteraction;\n" +
//                "import android.support.test.espresso.NoMatchingViewException;\n" +
//                "import android.support.test.espresso.PerformException;\n" +
//                "import android.support.test.espresso.NoActivityResumedException;\n" +
//                "import android.support.test.filters.LargeTest;\n" +
//                "import android.support.test.rule.ActivityTestRule;\n" +
//                "import android.support.test.runner.AndroidJUnit4;\n" +
//                "import android.util.Log;\n" +
//                "import android.widget.EditText;\n" +
//                "\n" +
//                "import org.junit.*;\n" +
//                "import org.junit.runner.RunWith;\n" +
//                "\n" +
//                "import static android.support.test.espresso.Espresso.onView;\n" +
//                "import static android.support.test.espresso.action.ViewActions.*;\n" +
//                "import static android.support.test.espresso.matcher.ViewMatchers.*;\n" +
//                //"import static it.gauss.test.IndexMatcher.*;\n" +
//                "import org.hamcrest.*;\n" +
//                "import android.view.View;\n" +
//                "import static org.hamcrest.Matchers.*;\n\n");
        
        out.print("import android.util.Log;\n" + 
        "\n" + 
        "import org.junit.*;\n" + 
        "import org.junit.runner.RunWith;\n" + 
        "\n" + 
        "import org.hamcrest.*;\n" + 
        //"import org.quantumbadger.redreader.activities.MainActivity;\n" + 
        //"import org.quantumbadger.redreader.activities.RepeatTest;\n" + 
        //"import org.quantumbadger.redreader.activities.RepeatedTestRule;\n" + 
        "\n" + 
        "import android.view.View;\n" + 
        "\n" + 
        "import androidx.test.espresso.NoActivityResumedException;\n" + 
        "import androidx.test.espresso.NoMatchingViewException;\n" + 
        "import androidx.test.espresso.PerformException;\n" + 
        "import androidx.test.espresso.ViewInteraction;\n" + 
        "import androidx.test.ext.junit.runners.AndroidJUnit4;\n" + 
        "import androidx.test.filters.LargeTest;\n" + 
        "import androidx.test.rule.ActivityTestRule;\n" + 
        "\n" + 
        "import static androidx.test.espresso.Espresso.onView;\n" + 
        "import static androidx.test.espresso.action.ViewActions.click;\n" + 
        "import static androidx.test.espresso.action.ViewActions.pressKey;\n" + 
        "import static androidx.test.espresso.matcher.ViewMatchers.isRoot;\n" + 
        "import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;\n" + 
        "import static androidx.test.espresso.matcher.ViewMatchers.withId;\n" + 
        "import static androidx.test.espresso.matcher.ViewMatchers.withText;\n"
        + "\n"
        + "import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;\n" + 
        "import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;\n" + 
        "import static org.hamcrest.CoreMatchers.allOf;\n" + 
        "import android.widget.EditText;\n" + 
        "import static androidx.test.espresso.action.ViewActions.clearText;\n" + 
        "import static androidx.test.espresso.action.ViewActions.typeText;");

        out.print("@RunWith(AndroidJUnit4.class)\n" +
                "@LargeTest\n");
        out.print("public class " + testName + " {\n\n");

        String activityName = appActivity.substring(appActivity.lastIndexOf('.')+1);

        out.print(INDENT);
        out.print("@Rule\n");
        out.print(INDENT);
        out.print("public ActivityTestRule<" + activityName + "> activityRule = new ActivityTestRule<>(" + activityName + ".class);\n\n");

        out.print(INDENT);
        out.print("@Rule\n");
        out.print(INDENT);
        out.print("public RepeatedTestRule repeatRule = new RepeatedTestRule();\n\n");

        
        out.print(INDENT);
        out.print("@Test\n");
        out.print(INDENT);
        // out.print("@RepeatTest(times = 10)\n");
        out.print("@RepeatTest(times = 1)\n");
        out.print("public void test() throws InterruptedException {\n");
        out.print(INDENT+INDENT);
        out.print("ViewInteraction last = null;\n");

        out.print(test.toString());

        out.print(INDENT);
        out.print("}\n");
        out.print("    private Matcher<View> withIndex(final Matcher<View> matcher, final int index) {\n" +
                "        return new TypeSafeMatcher<View>() {\n" +
                "            int currentIndex = 0;\n" +
                "\n" +
                "            @Override\n" +
                "            public void describeTo(Description description) {\n" +
                "                description.appendText(\"with index: \");\n" +
                "                description.appendValue(index);\n" +
                "                matcher.describeTo(description);\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public boolean matchesSafely(View view) {\n" +
                "                return matcher.matches(view) && currentIndex++ == index;\n" +
                "            }\n" +
                "        };\n" +
                "    }\n");
        out.print("}\n");

        out.close();
        System.out.println("Written file: " + outFile.getAbsoluteFile());
    }

}


