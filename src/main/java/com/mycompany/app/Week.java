package com.mycompany.app;

import java.util.Calendar;
import java.lang.NullPointerException;
/**
 * Created by employee on 5/20/15.
 */
public class Week {
    private final int firstDayOfWeek=0;
    private final int lastDayOfWeek=7;
    Calendar date;
    WeekDay[] days= new WeekDay[7];
    Week(Calendar date){
        this.date = date;
    }

    WeekDay weekDay = new WeekDay(date);


    public void createNewWeek()throws NullPointerException{
        int currentDayOfWeek=date.get(Calendar.DAY_OF_WEEK);
        while ( firstDayOfWeek < currentDayOfWeek){
            days[currentDayOfWeek]=weekDay;
            currentDayOfWeek--;
            weekDay.date.add(Calendar.DAY_OF_MONTH,-1);
        }
        while (lastDayOfWeek > currentDayOfWeek){
            currentDayOfWeek++;
            days[currentDayOfWeek]=weekDay;
            weekDay.date.add(Calendar.DAY_OF_MONTH,1);
        }
    }
    @Override
    public String toString(){
        createNewWeek();
        String week = null;
        for (int i = 0; i <days.length ; i++) {
            week=week+"\t"+days[i].toString();
        }
        return week;
    }
}
