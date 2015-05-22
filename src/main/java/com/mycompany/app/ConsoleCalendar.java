package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by employee on 5/22/15.
 */
public class ConsoleCalendar implements CalendarRender {
    /*ArrayList<Week> weeks = new ArrayList<>();
    ArrayList<WeekDay> weekDays = new ArrayList<>();
    String week;
    String day;*/
    @Override
    public void getOpenDayToken(){

    }
    public abstract void getCloseDayToken();
    public abstract void getOpenWeekToken();
    public abstract void getCloseWeekToken();
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
    }
}
