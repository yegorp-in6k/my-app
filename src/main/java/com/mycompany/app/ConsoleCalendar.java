package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by employee on 5/22/15.
 */
public class ConsoleCalendar extends AbstractCalendarRender {
    /*ArrayList<Week> weeks = new ArrayList<>();
    ArrayList<WeekDay> weekDays = new ArrayList<>();
    String week;
    String day;*/
/*
    public String render(MonthCalendar monthCalendar) {
        String result="";
        //weeks = monthCalendar.getWeeks();
        //weekDays = weeks.get(day).getDays();
        for (Week week : monthCalendar.getWeeks()){
            //System.out.println(week.toString());
            for (WeekDay day : week.getDays()){
                result += day+"\t";
            }
            result +="\n";
        }
        return result;
    }*/

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
