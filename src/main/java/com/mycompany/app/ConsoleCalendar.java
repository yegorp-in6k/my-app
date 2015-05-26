package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by employee on 5/22/15.
 */
public class ConsoleCalendar extends AbstractCalendarRender {

    @Override
    public String getCloseDayToken() {
        return "\t";
    }
    @Override
    public String getCloseWeekToken() {
        return "\n";
    }

    @Override
    public String getOpenDayToken() {
        return "";
    }
    @Override
    public String getOpenWeekToken() {
        return "";
    }
    @Override
    public String getOpenDayColorToken() {
        return "\033[31m";
    }
    @Override
    public String getCloseDayColorToken() {
        return "\033[0m";}
}
