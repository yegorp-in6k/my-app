package com.mycompany.app;

import java.util.Calendar;

/**
 * Created by employee on 5/22/15.
 */
public abstract class  AbstractCalendarRender implements CalendarRender{
    public abstract String getOpenDayToken();
    public abstract String getCloseDayToken();
    public abstract String getOpenWeekToken();
    public abstract String getCloseWeekToken();
    public abstract String getOpenDayColorToken();
    public abstract String getCloseDayColorToken();

    public String render(MonthCalendar monthCalendar) {
        String result = "";
        for (Week week : monthCalendar.getWeeks()){
            result += renderWeeks(week);
        }
        return getOpenDayColorToken()+result+getCloseDayColorToken();
    }
    public String renderWeeks(Week week){
        String result="";
        for(WeekDay day : week.getDays()){
            result+=renderWeek(day);
        }
        return getOpenWeekToken()+result+getCloseWeekToken();
    }
    public String renderWeek(WeekDay days){
        String day= days.toString();
        return getOpenDayToken()+day+getCloseDayToken();
    }


}
