package cz.martykan.forecastie.activities;

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
public class testcase8_003 {

    @Rule
    public ActivityTestRule<SplashActivity> activityRule = new ActivityTestRule<>(SplashActivity.class);

    @Rule
    public RepeatedTestRule repeatRule = new RepeatedTestRule();

    @Test
    @RepeatTest(times = 1)
public void test() throws InterruptedException {
        ViewInteraction last = null;
        long testStartTime = System.currentTimeMillis();

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageView\").description(\"More options\")")
        last = onView(withIndex(withContentDescription("More options"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Weather Map\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Weather Map"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Wind\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Wind"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Temperature\")", "new UiSelector().className(\"android.widget.TextView\").instance(2)")
        last = onView(withIndex(withText("Temperature"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Wind\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Wind"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Wind\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Wind"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Wind\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Wind"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Rain\")", "new UiSelector().className(\"android.widget.TextView\")")
        last = onView(withIndex(withText("Rain"), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Wind\")", "new UiSelector().className(\"android.widget.TextView\").instance(1)")
        last = onView(withIndex(withText("Wind"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"cz.martykan.forecastie:id/bb_bottom_bar_icon\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(cz.martykan.forecastie.R.id.bb_bottom_bar_icon), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"cz.martykan.forecastie:id/bb_bottom_bar_icon\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(cz.martykan.forecastie.R.id.bb_bottom_bar_icon), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"cz.martykan.forecastie:id/bb_bottom_bar_icon\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(cz.martykan.forecastie.R.id.bb_bottom_bar_icon), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"cz.martykan.forecastie:id/bb_bottom_bar_icon\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(cz.martykan.forecastie.R.id.bb_bottom_bar_icon), 0));

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
