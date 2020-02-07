package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Intent;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityUnitTestCase;
import android.test.ApplicationTestCase;

import com.example.android.androidjokelibrary.MainJokeActivity;
import com.example.android.jokelibrary.JokeMaker;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class SimpleAndroidTest extends ApplicationTestCase {

    String response = null;
    CountDownLatch signal = null;

    public SimpleAndroidTest() {
        super(Application.class);
    }

    @Test
    public void testVerifyAsyncTaskResponse() throws InterruptedException {
        signal = new CountDownLatch(1);
        GetJokeTask task = new GetJokeTask();
        task.setListener(new GetJokeTask.GetJokeTaskListener() {
            @Override
            public void onComplete(String result) {
                response = result;
                signal.countDown();
            }
        }).execute(getContext());
        signal.await();

        //Make sure the response is a non-empty string
        assertFalse(response.equals(""));
    }


}
