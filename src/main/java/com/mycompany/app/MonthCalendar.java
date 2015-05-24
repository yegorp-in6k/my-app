package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
/**
 * Created by employee on 5/20/15.
 */
public class MonthCalendar {
    ArrayList<Week> weeks = new ArrayList<>();
    Calendar date = Calendar.getInstance();

    public ArrayList<Week> getWeeks() {
        return weeks;
    }

    public MonthCalendar(Calendar date){
        this.date.setTime(date.getTime());
        createMonth();
    }
    public int counterOfWeeksInMonth(){
        double dayOfMonth=date.getActualMaximum(Calendar.DAY_OF_MONTH);
        double numberOfWeeks = (dayOfMonth/7);
        return (int) Math.ceil(numberOfWeeks);
    }
    private void createMonth(){
        Week currentWeek=new Week(date) ;
        weeks.add(currentWeek);
        for (int firstWeek=0; firstWeek < counterOfWeeksInMonth() /*5*/; firstWeek++) {

            currentWeek = currentWeek.createNextWeek();
            weeks.add(currentWeek);
        }
    }
}
