package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class WeekDay {
    public WeekDayType type;
    public Calendar date;
    // public Week week;
    public WeekDay(){

    }

    public Calendar getDate(){
        return date;
    }

    public WeekDay( Calendar date) {
        //this.type = type;
        Calendar c =Calendar.getInstance();
        c.setTime(date.getTime());

        this.date = c;
        //this.week = week;
        type =  WeekDayType.values()[date.get(Calendar.DAY_OF_WEEK)-1];
    }
    @Override
    public String toString(){
        String dayOfMonth="";
        if (type.isWeekensDay()){
            dayOfMonth="\033[31m"+date.get(Calendar.DAY_OF_MONTH)+"\033[0m";
        } else {
            dayOfMonth =Integer.toString(date.get(Calendar.DAY_OF_MONTH));
        }
        //return null;
        return dayOfMonth;
    }
}
