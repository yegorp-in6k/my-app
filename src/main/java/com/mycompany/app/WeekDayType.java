package com.mycompany.app;

import java.util.Calendar;

/**
 * Created by employee on 5/20/15.
 */
public enum WeekDayType {
    Sunday("Sun", Calendar.SUNDAY,true),Monday("Mon", Calendar.MONDAY, false),Tuesday("Tue", Calendar.TUESDAY, false),
    Wednesday("Wed",Calendar.WEDNESDAY,false),Thursday("Thu",Calendar.THURSDAY,false), Friday("Fri",Calendar.FRIDAY,false),
    Saturday("San",Calendar.SATURDAY,true);

    public String title;
    public int id;
    public boolean weekendDay;


    WeekDayType(String title, int id,boolean weekendDay){
        this.title=title;
        this.id=id;
        this.weekendDay=weekendDay;
    }
    public String toString(){
        return title;
    }

    }