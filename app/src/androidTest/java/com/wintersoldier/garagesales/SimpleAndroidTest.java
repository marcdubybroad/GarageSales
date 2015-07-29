package com.wintersoldier.garagesales;

import android.test.AndroidTestCase;

import com.garagze.event.domain.SaleEvent;
import com.garagze.event.service.SaleEventManager;

import java.util.List;

/**
 * Created by mduby on 7/29/15.
 */
public class SimpleAndroidTest extends AndroidTestCase {

    public void testGetAllEvents() {
//        fail("not implemented yet");
        List<SaleEvent> events = SaleEventManager.getAllEvents(this.getContext());

        // get the number of events
        int eventCount = events.size();

        // test
        assertEquals(20, eventCount);
    }
}
