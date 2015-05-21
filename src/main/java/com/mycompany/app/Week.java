package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by employee on 5/20/15.
 */
public class Week {
    private final int FIRST_DAY_OF_WEEK =1;
    private final int LAST_DAY_OF_WEEK =7;
    Calendar date;
    Calendar currentDate;
    //WeekDay[] days= new WeekDay[7];

    private ArrayList<WeekDay> days;

    Week(Calendar date){
        this.date = date;
        days = new ArrayList<>();
        currentDate= new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH),
                date.get(Calendar.DAY_OF_MONTH));

        populateWeek();
    }



    public Week createNextWeek() {
        Calendar c = Calendar.getInstance();
        c.setTime(days.get(6).getDate().getTime());
        c.add(Calendar.DAY_OF_YEAR, 1);

        return new Week(c);
    }

    public Week populateWeek() {
        Calendar c = Calendar.getInstance();
        c.setTime(date.getTime());

        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);


        c.add(Calendar.DAY_OF_YEAR, -(dayOfWeek - 1));


        for (int i = 0; i < 7; i++) {
            days.add(new WeekDay(c));
            c.add(Calendar.DAY_OF_YEAR, 1);
        }
        return this;
    }
/*
        WeekDay weekDay = new WeekDay(date);
        int currentDayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        if (FIRST_DAY_OF_WEEK <= currentDayOfWeek){
            while ( FIRST_DAY_OF_WEEK <= currentDayOfWeek){
                days.add(weekDay);
                currentDayOfWeek--;
                //weekDay.date.add(Calendar.DAY_OF_MONTH,-1);
                date=new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH),
                        date.get(Calendar.DAY_OF_MONTH) - 1);
                weekDay=new WeekDay(date);

            }
        } else {
            while (LAST_DAY_OF_WEEK > currentDayOfWeek){
                currentDayOfWeek++;
                days.add(weekDay);
                //weekDay.date.add(Calendar.DAY_OF_MONTH,1);
                weekDay=new WeekDay(date);
                date=new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH),
                        date.get(Calendar.DAY_OF_MONTH) + 1);
            }
        }
        */

    @Override
    public String toString(){
        //createNewWeek();
        String week = "";
        for (WeekDay day:days) {
            week=week+"\t"+day.toString();
        }
        return week;
    }
}
