package io.github.hidroh.materialistic;

import android.util.Log;

import org.junit.*;
import org.junit.runner.RunWith;

import org.hamcrest.*;

import android.view.View;

import androidx.test.espresso.NoActivityResumedException;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressKey;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static org.hamcrest.CoreMatchers.allOf;
import android.widget.EditText;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.typeText;@RunWith(AndroidJUnit4.class)
@LargeTest
public class testcase7_020 {

    @Rule
    public ActivityTestRule<LauncherActivity> activityRule = new ActivityTestRule<>(LauncherActivity.class);

    @Rule
    public RepeatedTestRule repeatRule = new RepeatedTestRule();

    @Test
    @RepeatTest(times = 1)
public void test() throws InterruptedException {
        ViewInteraction last = null;
        long testStartTime = System.currentTimeMillis();

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(10)")
        last = onView(withIndex(withText("..."), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(10)")
        last = onView(withIndex(withText("..."), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	swipe(driver, 0.5, 0.8, 0.5, 0.2)
        try{ last = onView(isRoot()).perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(19)")
        last = onView(withIndex(withText("..."), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Last updated 6 mins ago\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Last updated 6 mins ago"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageView\").description(\"More options\")")
        last = onView(withIndex(withContentDescription("More options"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Last updated 7 mins ago\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Last updated 7 mins ago"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageView\").description(\"More options\")")
        last = onView(withIndex(withContentDescription("More options"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageButton\").description(\"Open drawer\")")
        last = onView(withIndex(withContentDescription("Open drawer"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageView\").description(\"Login\")")
        last = onView(withIndex(withContentDescription("Login"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_username\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_username), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("test");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("test")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_password\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_password), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("12st");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("12st")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_username\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_username), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("1test");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("1test")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_password\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_password), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("1test");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("1test")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_username\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_username), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("test");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("test")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_password\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_password), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("12st");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("12st")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/text_input_password_toggle\").className(\"android.widget.ImageButton\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.text_input_password_toggle), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_password\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_password), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("testt");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("testt")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_password\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_password), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("12est");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("12est")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Login\")", "new UiSelector().className(\"android.widget.Button\").instance(1)")
        last = onView(withIndex(withText("Login"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        long testFinishTime = System.currentTimeMillis();
        Log.d("IN-VIVO", "Test: "+ getClass().getName()+", duration: " + ((testFinishTime-testStartTime)) + " ms");
	 // TimePrinter.getInstance().log("" + getClass().getName() + ", " + (testFinishTime-testStartTime));
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
