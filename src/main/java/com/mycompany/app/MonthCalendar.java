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
    public String printHeader(){
        String header = "";
        for (WeekDayType weekDayType: Arrays.asList(WeekDayType.values())) {
            header += "\t" + weekDayType.toString();
        }
        return header;
    }
    public String printHeaderHtml(){
        String header = "";
        for (WeekDayType weekDayType: Arrays.asList(WeekDayType.values())) {
            header += "\t" + weekDayType.toHtml();
        }
        return header;
    }
    private void createMonth(){
        Week currentWeek=new Week(date) ;
        weeks.add(currentWeek);
        for (int firstWeek=0; firstWeek < 5; firstWeek++) {

            currentWeek = currentWeek.createNextWeek();
            weeks.add(currentWeek);
        }
    }

    public String toString(){
        String weekInMonth = "";
        for (Week week: weeks) {
            weekInMonth +="\n\n" +week.toString();
        }
        return weekInMonth;
    }

    public String toHtml(){
        String weekInMonth = "";
        for (Week week: weeks) {
            weekInMonth +="\n\n" +"<tr>"+ week.toHtml()+"</tr>";
        }
        return weekInMonth;
    }
}
