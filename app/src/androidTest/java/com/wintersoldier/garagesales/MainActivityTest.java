package com.wintersoldier.garagesales;

import android.widget.TextView;

/**
 * Created by mduby on 7/29/15.
 */
public class MainActivityTest extends android.test.ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testActivityUI() {
        TextView textView = (TextView) this.getActivity().findViewById(R.id.textView);

        String actualResults = textView.getText().toString();

        String expectedResults = "Number of events is: 15";

        assertEquals(expectedResults, actualResults);
    }

}
