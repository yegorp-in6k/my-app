package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class InputReader {
    InputReader() {

    }
    Calendar c = Calendar.getInstance();

    public Calendar getFirstDayOfMonth() {

        c.set(Calendar.DAY_OF_MONTH, 1);

        return c;

    }

}
