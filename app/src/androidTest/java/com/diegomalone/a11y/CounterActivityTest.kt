package com.diegomalone.a11y

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.google.android.apps.common.testing.accessibility.framework.AccessibilityCheckResultUtils.matchesViews
import org.hamcrest.CoreMatchers.anyOf
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class CounterActivityTest {

    @get:Rule
    var activityRule = ActivityTestRule(CounterActivity::class.java, true, true)

    @Test
    fun whenClickIncreaseShouldIncreaseCounter() {
        onView(withId(R.id.increaseButton))
            .perform(click())

        onView(withId(R.id.counterTextView))
            .check(matches(withText("2")))
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
//            AccessibilityChecks.enable()
//                .setRunChecksFromRootView(true)
//                .setSuppressingResultMatcher(matchesViews(
//                    anyOf(
//                        withId(R.id.increaseButton),
//                        withId(R.id.decreaseButton)
//                    )
//                ))
        }
    }
}
