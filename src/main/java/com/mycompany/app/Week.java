package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by employee on 5/20/15.
 */
public class Week {
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
        Calendar cloneOfDateForCreateNextWeek = Calendar.getInstance();
        cloneOfDateForCreateNextWeek .setTime(days.get(LAST_DAY_OF_WEEK-1).getDate().getTime());
        cloneOfDateForCreateNextWeek .add(Calendar.DAY_OF_YEAR, 1);

        return new Week(cloneOfDateForCreateNextWeek );
    }

    public Week populateWeek() {
        Calendar cloneOfDateForPopulateWeek = Calendar.getInstance();
        cloneOfDateForPopulateWeek.setTime(date.getTime());

        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);


        cloneOfDateForPopulateWeek.add(Calendar.DAY_OF_YEAR, -(dayOfWeek - 1));


        for (int i = 0; i < LAST_DAY_OF_WEEK; i++) {
            days.add(new WeekDay(cloneOfDateForPopulateWeek));
            cloneOfDateForPopulateWeek.add(Calendar.DAY_OF_YEAR, 1);
        }
        return this;
    }

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
