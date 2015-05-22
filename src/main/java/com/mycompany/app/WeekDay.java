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


    public WeekDay( Calendar date) {
        Calendar c =Calendar.getInstance();
        c.setTime(date.getTime());
        this.date = c;
        type =  WeekDayType.getByDate(date);
    }
    public Calendar getDate(){

        return date;
    }
    @Override
    public String toString(){
        String result = "";

        result += (type.isWeekensDay()) ? RED : BLACK;
        result += date.get(Calendar.DAY_OF_MONTH);

        return result;
    }
    public String toStringHtml(){
        String result = "";

        result += (type.isWeekensDay()) /*? RED : BLACK*/;
        result +="<td>" + date.get(Calendar.DAY_OF_MONTH)+"</td>";

        return result;
    }

    
}
