package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Muhammad Attia on 07/07/2017.
 */

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testOk = true;
        new JokeAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("Error: Loaded Joke = " + fragment.Joke, fragment.Joke != null);
    }
}