package com.fittracker;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.fittracker", appContext.getPackageName());
    }

    public void testImageViewIsNotNull() {
        ActivityScenario<Splashscreenok> scenario = ActivityScenario.launch(Splashscreenok.class);
        scenario.onActivity(activity -> {
            ImageView imageView = activity.findViewById(R.id.appsplash);
            assertNotNull(imageView);
        });
    }

    @Test
    public void testTextViewIsNotNull() {
        ActivityScenario<Splashscreenok> scenario = ActivityScenario.launch(Splashscreenok.class);
        scenario.onActivity(activity -> {
            TextView textView = activity.findViewById(R.id.appname);
            assertNotNull(textView);
        });
    }

    @Test
    public void testAnimationsAreLoaded() {
        ActivityScenario<Splashscreenok> scenario = ActivityScenario.launch(Splashscreenok.class);
        scenario.onActivity(activity -> {
            Animation up = AnimationUtils.loadAnimation(activity.getApplicationContext(), R.anim.up);
            Animation down = AnimationUtils.loadAnimation(activity.getApplicationContext(), R.anim.down);
            assertNotNull(up);
            assertNotNull(down);
        });
    }
}