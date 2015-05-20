package com.mycompany.app;

import java.util.Calendar;
import java.lang.NullPointerException;
/**
 * Created by employee on 5/20/15.
 */
public class MonthCalendar {
    Week arr[] = new Week[6];
    Calendar date;

    Week week = new Week(date);

    MonthCalendar(Calendar date){
        this.date = date;
    }

    public void createMonth()throws NullPointerException{
        for (int firstWeek=0; firstWeek < arr.length; firstWeek++) {
            arr[firstWeek] = week;
            week.createNewWeek();
        }
    }
    @Override
    public String toString()throws NullPointerException{
        createMonth();
        String weekInMonth = null;
        for (int i = 0; i <arr.length ; i++) {
            weekInMonth = weekInMonth + "\n\n" + arr[i];
        }
        return weekInMonth;
    }
}
