/*
 Name : Santhosh Damodharan
 Student number : 300964037
 Assignment number : 2
 File Name : Pizaa Spot
 Description : pizza app used to select user desired pizza's
 Version : 1.0.0

 */

package com.example.santhoshdamodharan.santhoshdamodharan_mapd711_lab_pizzaonline;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.santhoshdamodharan.santhoshdamodharan_mapd711_lab_pizzaonline", appContext.getPackageName());
    }
}
