package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * Created by employee on 5/20/15.
 */
public class Week {
    private final int firstDayOfWeek=1;
    private final int lastDayOfWeek=7;
    Calendar date;
    //WeekDay[] days= new WeekDay[7];
    ArrayList<WeekDay> days= new ArrayList<>();
    Week(Calendar date){
        this.date = date;
    }

    WeekDay weekDay = new WeekDay(date);


    public void createNewWeek(){
        int currentDayOfWeek=date.get(Calendar.DAY_OF_WEEK);
        if (firstDayOfWeek>currentDayOfWeek){
            while ( firstDayOfWeek < currentDayOfWeek){
                days.set(currentDayOfWeek,weekDay);
                currentDayOfWeek--;
                weekDay.date.add(Calendar.DAY_OF_MONTH,-1);
            }
        } else {
            while (lastDayOfWeek > currentDayOfWeek){
                currentDayOfWeek++;
                days.set(currentDayOfWeek,weekDay);
                weekDay.date.add(Calendar.DAY_OF_MONTH,1);
            }
        }
    }
    @Override
    public String toString(){
        //createNewWeek();
        String week = null;
        for (int i = 0; i <days.size() ; i++) {
            week=week+"\t"+days.get(i).toString();
        }
        return week;
    }
}
