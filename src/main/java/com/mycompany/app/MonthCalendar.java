package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
/**
 * Created by employee on 5/20/15.
 */
public class MonthCalendar {
    ArrayList<Week> arr = new ArrayList<>();
    Calendar date;

    public MonthCalendar(Calendar date){
        Calendar c = Calendar.getInstance();
        c.setTime(date.getTime());
        this.date = date;
    }
    public String printHeader(){
        String header="";
        for (WeekDayType weekDayType: Arrays.asList(WeekDayType.values())) {
            header += "\t" + weekDayType.toString();
        }
        return header;
    }
    public void createMonth(){
        Week week=new Week(date) ;
        arr.add(week);
        for (int firstWeek=0; firstWeek < 5; firstWeek++) {

            week=week.createNextWeek();
            arr.add(week);
        }
    }

    @Override
    public String toString(){
        String weekInMonth = "";
        for (Week week: arr) {
            weekInMonth += "\n\n" + week.toString();
        }
        return weekInMonth;
    }
}
