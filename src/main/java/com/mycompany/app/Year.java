package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by employee on 5/26/15.
 */
public class Year {
    String[] calendarInfo;
    ArrayList<MonthCalendarFile> monthes = new ArrayList<>() ;

    public Year(String[] calendarInfo) {
        this.calendarInfo = calendarInfo;
        craeteMonthes();

    }

    public String getYear(){
        return calendarInfo[0];
    }

    private void craeteMonthes(){
        if (calendarInfo.length==1){
            for (int i = 0; i < 12 ; i++) {
                InputReader reader = new InputReader(getYear(),Integer.toString(i + 1));
                MonthCalendarFile calendar=new MonthCalendarFile(reader.getDate());
                monthes.add(calendar);
            }
        }else{
            for (int i = 1; i <calendarInfo.length ; i++) {
                String month = calendarInfo[i];
                InputReader reader = new InputReader(getYear(),month);
                MonthCalendarFile calendar = new MonthCalendarFile(reader.getDate());
                monthes.add(calendar);
            }
        }
    }


    public void persist() throws IOException {
        for (MonthCalendarFile monthCalendarFile : monthes){
            monthCalendarFile.persist();
        }
    }
}
