package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class WeekDay {
    public WeekDayType type;
    public Calendar date;
    final String RED="\u001b[31m";
    final String BLACK="\u001b[0m";
    public Calendar getDate(){

        return date;
    }

    public WeekDay( Calendar date) {
        Calendar c =Calendar.getInstance();
        c.setTime(date.getTime());
        this.date = c;
        type =  WeekDayType.values()[date.get(Calendar.DAY_OF_WEEK)-1];
    }
    @Override
    public String toString(){
        String dayOfMonth="";
        if (type.isWeekensDay()){
            dayOfMonth = RED + date.get(Calendar.DAY_OF_MONTH);
        } else {
            dayOfMonth = BLACK +date.get(Calendar.DAY_OF_MONTH);
        }
        return dayOfMonth;
    }
}
