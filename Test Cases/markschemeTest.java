package com.example.guide;

import static org.junit.Assert.*;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class markschemeTest {

    @Rule
    public ActivityTestRule<markscheme> mActivityTestRule=new ActivityTestRule<markscheme>(markscheme.class);
    private markscheme mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
        View view = mActivity.findViewById(R.id.pdfmarkscheme);
        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}