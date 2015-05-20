package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class WeekDay {
    public WeekDayType type;
    public Calendar date;
    public Week week;

    public WeekDay(WeekDayType type, Calendar date, Week week) {
        this.type = type;
        this.date = date;
        this.week = week;
    }

    public String toString(){
        if (type.weekendDay==true){
            System.out.println("\033[31m"+date.get(Calendar.DAY_OF_MONTH)+"\t\033[0m");
        } else {
            System.out.println(date.);
        }
    }
}
