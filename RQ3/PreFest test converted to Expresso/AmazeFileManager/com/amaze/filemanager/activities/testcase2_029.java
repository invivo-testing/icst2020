package com.amaze.filemanager.activities;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.NoActivityResumedException;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.widget.EditText;

import org.junit.*;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import org.hamcrest.*;
import android.view.View;
import static org.hamcrest.Matchers.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class testcase2_029 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public RepeatedTestRule repeatRule = new RepeatedTestRule();

    @Test
    @RepeatTest(times = 10)
public void test() throws InterruptedException {
        ViewInteraction last = null;
        long testStartTime = System.currentTimeMillis();

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageView\").description(\"More options\")")
        last = onView(withIndex(withContentDescription("More options"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/submenuarrow\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.submenuarrow), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	driver.press_keycode(4)
        try{onView(isRoot()).perform(pressKey(4));}
        //hitting BACK button may have caused the activity to exit
        catch(NoActivityResumedException e){
            long testFinishTime = System.currentTimeMillis();
            Log.d("IN-VIVO", "Test: "+ getClass().getName()+", duration: " + ((testFinishTime-testStartTime)) + " ms");
TimePrinter.getInstance().log("" + getClass().getName() + ", " + (testFinishTime-testStartTime));
            return;
        };
        Thread.sleep(1000);

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageButton\").description(\"Navigate up\")")
        last = onView(withIndex(withContentDescription("Navigate up"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/imageButton\").className(\"android.widget.ImageButton\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.imageButton), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	driver.press_keycode(82)
        onView(isRoot()).perform(pressKey(82));
        Thread.sleep(1000);

        // 	driver.press_keycode(82)
        onView(isRoot()).perform(pressKey(82));
        Thread.sleep(1000);

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Location\")", "new UiSelector().className(\"android.widget.TextView\").instance(3)")
        last = onView(withIndex(withText("Location"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	driver.press_keycode(82)
        onView(isRoot()).perform(pressKey(82));
        Thread.sleep(1000);

        // 	element = getElememtBack(driver, "new UiSelector().text(\"sdcard\")", "new UiSelector().className(\"android.widget.TextView\").instance(2)")
        last = onView(withIndex(withText("sdcard"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"/storage\")", "new UiSelector().className(\"android.widget.TextView\").instance(4)")
        last = onView(withIndex(withText("/storage"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"items 0.00B\")", "new UiSelector().className(\"android.widget.TextView\").instance(6)")
        last = onView(withIndex(withText("items 0.00B"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"/storage\")", "new UiSelector().className(\"android.widget.TextView\").instance(4)")
        last = onView(withIndex(withText("/storage"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Location\")", "new UiSelector().className(\"android.widget.TextView\").instance(3)")
        last = onView(withIndex(withText("Location"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"OK\")", "new UiSelector().className(\"android.widget.TextView\").instance(9)")
        last = onView(withIndex(withText("OK"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        long testFinishTime = System.currentTimeMillis();
        Log.d("IN-VIVO", "Test: "+ getClass().getName()+", duration: " + ((testFinishTime-testStartTime)) + " ms");
TimePrinter.getInstance().log("" + getClass().getName() + ", " + (testFinishTime-testStartTime));
    }
    private Matcher<View> withIndex(final Matcher<View> matcher, final int index) {
        return new TypeSafeMatcher<View>() {
            int currentIndex = 0;

            @Override
            public void describeTo(Description description) {
                description.appendText("with index: ");
                description.appendValue(index);
                matcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                return matcher.matches(view) && currentIndex++ == index;
            }
        };
    }
}
