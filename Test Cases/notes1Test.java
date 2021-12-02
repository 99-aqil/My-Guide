package com.example.guide;

import static org.junit.Assert.*;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class notes1Test {

    @Rule
    public ActivityTestRule<notes1> mActivityTestRule=new ActivityTestRule<notes1>(notes1.class);
    private notes1 mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
        View view = mActivity.findViewById(R.id.pdfnotes1);
        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}