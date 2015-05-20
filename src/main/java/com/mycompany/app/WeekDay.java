package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class WeekDay {
    public WeekDayType type;
    public Calendar date;
 //   public Week week;
    public WeekDay(){

    }

    public WeekDay( Calendar date) {
        //this.type = type;
        this.date = date;
        //this.week = week;
    }
    @Override
    public String toString(){
        String dayOfMonth;
        if (type.weekendDay==true){
            dayOfMonth="\033[31m"+Integer.toString(date.get(Calendar.DAY_OF_MONTH))+"\t\033[0m";
        } else {
            dayOfMonth =Integer.toString(date.get(Calendar.DAY_OF_MONTH));
        }
        //return null;
        return dayOfMonth;
    }
}
