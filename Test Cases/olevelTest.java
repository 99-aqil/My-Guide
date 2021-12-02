package com.example.guide;

import static org.junit.Assert.*;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class olevelTest {

    @Rule
    public ActivityTestRule<olevel>mActivityTestRule=new ActivityTestRule<olevel>(olevel.class);
    private olevel mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
        View view = mActivity.findViewById(R.id.mathb);
        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}