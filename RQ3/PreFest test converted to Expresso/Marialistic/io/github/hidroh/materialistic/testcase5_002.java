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
public class testcase5_002 {

    @Rule
    public ActivityTestRule<LauncherActivity> activityRule = new ActivityTestRule<>(LauncherActivity.class);

    @Rule
    public RepeatedTestRule repeatRule = new RepeatedTestRule();

    @Test
    @RepeatTest(times = 1)
public void test() throws InterruptedException {
        ViewInteraction last = null;
        long testStartTime = System.currentTimeMillis();

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(21)")
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

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/button_more\").className(\"android.widget.ImageButton\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.button_more), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(13)")
        last = onView(withIndex(withText("..."), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/button_more\").className(\"android.widget.ImageButton\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.button_more), 0));

        // 	TouchAction(driver).long_press(element).release().perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"...\")", "new UiSelector().className(\"android.widget.TextView\").instance(28)")
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

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/search_button\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.search_button), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/search_src_text\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.search_src_text), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("Search HN");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("Search HN")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/search_src_text\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.search_src_text), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("Search HN");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("Search HN")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/search_src_text\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.search_src_text), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("12");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("12")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/search_close_btn\").className(\"android.widget.ImageView\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.search_close_btn), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().className(\"android.widget.ImageButton\").description(\"Open drawer\")")
        last = onView(withIndex(withContentDescription("Open drawer"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Feedback\")", "new UiSelector().className(\"android.widget.TextView\").instance(8)")
        last = onView(withIndex(withText("Feedback"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_body\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_body), 0));

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

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_title\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_title), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("12stt");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("12stt")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_body\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_body), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("")); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememtBack(driver, "new UiSelector().text(\"Send Feedback\")", "new UiSelector().className(\"android.widget.Button\")")
        last = onView(withIndex(withText("Send Feedback"), 0));

        // 	TouchAction(driver).tap(element).perform()
        try{ last = last.perform(click()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element = getElememt(driver, "new UiSelector().resourceId(\"io.github.hidroh.materialistic:id/edittext_body\").className(\"android.widget.EditText\")")
        last = onView(withIndex(withId(io.github.hidroh.materialistic.R.id.edittext_body), 0));

        // 	element.clear()
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(clearText()); }
        catch(NoMatchingViewException e1){System.err.println("Element not found, skipping event");}
        catch(PerformException e2){System.err.println("Element partially hidden, skipping event");};

        // 	element.send_keys("");
        last = onView(allOf(isDisplayed(), isAssignableFrom(EditText.class)));
        try{ last = last.perform(typeText("")); }
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
