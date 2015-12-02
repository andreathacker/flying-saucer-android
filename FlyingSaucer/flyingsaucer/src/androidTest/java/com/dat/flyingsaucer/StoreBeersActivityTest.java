package com.dat.flyingsaucer;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.test.ActivityInstrumentationTestCase2;

import com.dat.flyingsaucer.store.StoreBeersActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class StoreBeersActivityTest {


    @Rule
    public ActivityTestRule<StoreBeersActivity> mActivityRule = new ActivityTestRule<>(
            StoreBeersActivity.class);

    public StoreBeersActivityTest() {

    }

    @Before
    public void setUp() {

    }

    /**
     * This is a very basic test for demo purposes
     */
    @Test
    public void testTitleIsSet(){
        onView(withId(R.id.beer_list_header_text)).check(matches(withText(R.string.title_beer_list)));
    }
}
