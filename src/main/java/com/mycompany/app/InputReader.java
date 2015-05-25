package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by employee on 5/20/15.
 */
public class InputReader  {
    int year= 2015;
    public String monthStr="";
    public InputReader() {

    }
    public InputReader(String year, String monthStr) {
        this.year =Integer.parseInt(year);
        this.monthStr = monthStr;
    }



    public void inputFromKeybord() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         do {
            System.out.print("Insert year:");
            year= Integer.parseInt(reader.readLine());
            System.out.print("Insert month:");
            monthStr= reader.readLine();
             if (checkMonth(monthStr)==true){
                 break;
             }
            System.out.println("You insert month wrong!!!Try something like that:10|Oct|October");
         }while (checkMonth(monthStr)==false);
    }
    private static int getMonth(String monthStr) {
        int month=0;
        switch (monthStr) {
            case "Jan":
            case "January":
            case "1":
                month = 0;
                break;
            case "Feb":
            case "February":
            case "2":
                month = 1;
                break;
            case "Mar":
            case "March":
            case "3":
                month = 2;
                break;
            case "Apr":
            case "April":
            case "4":
                month = 3;
                break;
            case "May":
            case "5":
                month = 4;
                break;
            case "Jun":
            case "June":
            case "6":
                month = 5;
                break;
            case "Jul":
            case "July":
            case "7":
                month = 6;
                break;
            case "Aug":
            case "August":
            case "8":
                month = 7;
                break;
            case "Sep":
            case "September":
            case "9":
                month = 8;
                break;
            case "Oct":
            case "October":
            case "10":
                month = 9;
                break;
            case "Nov":
            case "November":
            case "11":
                month = 10;
                break;
            case "Dec":
            case "December":
            case "12":
                month = 11;
                break;
        }
        return month;
    }

    public static boolean checkMonth(String testString) {
        Pattern p = Pattern.compile("^Jun|June|1|Feb|February|2|Mar|March|3|Apr|April|4|May|5|Jun|June|6|Jul|July|7|Aug|August|8|Sep|September|9|Oct|October|10|Nov|November|11|Dec|December|12$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
   // Calendar c = Calendar.getInstance();

    public Calendar getDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.MONTH, getMonth(monthStr));
        c.set(Calendar.YEAR, year);
        //c.set
        return c;
    }

}
