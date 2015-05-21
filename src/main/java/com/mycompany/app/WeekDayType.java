package com.mycompany.app;

import java.util.Calendar;

/**
 * Created by employee on 5/20/15.
 */
public enum WeekDayType {
    Sunday("Sun", Calendar.SUNDAY,true),
    Monday("Mon", Calendar.MONDAY, false),
    Tuesday("Tue", Calendar.TUESDAY, false),
    Wednesday("Wed",Calendar.WEDNESDAY,false),
    Thursday("Thu",Calendar.THURSDAY,false),
    Friday("Fri",Calendar.FRIDAY,false),
    Saturday("San",Calendar.SATURDAY,true);

    public String title;
    public int id;
    public boolean weekendDay;

    WeekDayType(String title, int id,boolean weekendDay){
        this.title=title;
        this.id=id;
        this.weekendDay=weekendDay;
    }
    public  boolean isWeekensDay(){

        return weekendDay;
    }
    @Override
    public String toString(){
        return title;
    }

    public static WeekDayType getByDate(Calendar date) {
        return values()[date.get(Calendar.DAY_OF_WEEK) - 1];
    }
}