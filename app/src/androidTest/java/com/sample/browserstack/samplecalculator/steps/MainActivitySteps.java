package com.sample.browserstack.samplecalculator.steps;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import com.sample.browserstack.samplecalculator.MainActivity;
import com.sample.browserstack.samplecalculator.R;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class MainActivitySteps {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup() {
        activityRule.launchActivity(new Intent());
    }

    @After
    public void tearDown() {
        activityRule.getActivity().finish();
    }

    @When("^I click the button \"(.*)\"$")
    public void iClickInTheButton(String button) {
        onView(allOf(isAssignableFrom(Button.class), withText(button))).perform(click());
    }

    @Then("^the value \"(.*)\" should be displayed$")
    public void theValueShouldBeDisplayed(String value) {
        onView(withId(R.id.editText)).check(matches(withText(value)));
    }
}
