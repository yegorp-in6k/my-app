package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * Created by employee on 5/20/15.
 */
public class MonthCalendar {
    //Week arr[] = new Week[6];
    ArrayList<Week> arr = new ArrayList<>();
    Calendar date;



    MonthCalendar(Calendar date){
        this.date = date;
    }

    Week week = new Week(date);

    public void createMonth(){
        for (int firstWeek=0; firstWeek < arr.size(); firstWeek++) {
            arr.set(firstWeek, week);
            week.createNewWeek();
        }
    }
    @Override
    public String toString(){
        //createMonth();
        String weekInMonth = null;
        for (int i = 0; i <arr.size() ; i++) {
            weekInMonth = weekInMonth + "\n\n" + arr.get(i).toString();
        }
        return weekInMonth;
    }
}
