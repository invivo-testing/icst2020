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
public class testcase7_023 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public RepeatedTestRule repeatRule = new RepeatedTestRule();

    @Test
    @RepeatTest(times = 10)
public void test() throws InterruptedException {
        ViewInteraction last = null;
        long testStartTime = System.currentTimeMillis();

        // 	driver.press_keycode(82)
        onView(isRoot()).perform(pressKey(82));
        Thread.sleep(1000);

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Set As Home\")", "new UiSelector().className(\"android.widget.TextView\").instance(3)")
        last = onView(withIndex(withText("Set As Home"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Do you want to set current path as home for this tab?\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Do you want to set current path as home for this tab?"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Do you want to set current path as home for this tab?\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Do you want to set current path as home for this tab?"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Yes\")", "new UiSelector().className(\"android.widget.TextView\").instance(3)")
        last = onView(withIndex(withText("Yes"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/search\").className(\"android.widget.TextView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.search), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/search_close_btn\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.search_close_btn), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/img_view_back\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.img_view_back), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/search_close_btn\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.search_close_btn), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/home\").className(\"android.widget.TextView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.home), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageButton\").description(\"Navigate up\")")
        last = onView(withIndex(withContentDescription("Navigate up"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"com.amaze.filemanager:id/home\").className(\"android.widget.TextView\")")
        last = onView(withIndex(withId(com.amaze.filemanager.R.id.home), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"DCIM\")", "new UiSelector().className(\"android.widget.CheckedTextView\").instance(1)")
        last = onView(withIndex(withText("DCIM"), 0));

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
