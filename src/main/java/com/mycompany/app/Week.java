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

    private ArrayList<WeekDay> days;

    Week(Calendar date){
        this.date = date;
        days = new ArrayList<>();
        currentDate = Calendar.getInstance();
        currentDate.setTime(date.getTime());


        populateWeek();
    }



    public Week createNextWeek() {
        Calendar dateForCreateNextWeek = Calendar.getInstance();
        dateForCreateNextWeek.setTime(days.get(LAST_DAY_OF_WEEK - 1).getDate().getTime());
        dateForCreateNextWeek.add(Calendar.DAY_OF_YEAR, 1);

        return new Week(dateForCreateNextWeek );
    }

    public Week populateWeek() {
        Calendar dateForPopulateWeek = Calendar.getInstance();
        dateForPopulateWeek.setTime(date.getTime());

        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);


        dateForPopulateWeek.add(Calendar.DAY_OF_YEAR, -(dayOfWeek - 1));


        for (int i = 0; i < LAST_DAY_OF_WEEK; i++) {
            days.add(new WeekDay(dateForPopulateWeek));
            dateForPopulateWeek.add(Calendar.DAY_OF_YEAR, 1);
        }
        return this;
    }
    public String toString(){
        String week = "";
        for (WeekDay day:days) {
            week=week+"\t"+day.toString();
        }
        return week;
    }

    public String toStringHtml(){
        String week = "";
        for (WeekDay day:days) {
            week=week+"\t"+day.toStringHtml();
        }
        return week;
    }
}
