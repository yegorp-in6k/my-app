package com.mycompany.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by employee on 5/26/15.
 */
public class MonthCalendarFile {
    private MonthCalendar monthCalendar;
    private File file;
    public MonthCalendarFile(Calendar c) {
        this.monthCalendar = new MonthCalendar(c);
        this.file = new File(createPath(c));
    }

    private String createPath(Calendar c) {
        String year =Integer.toString(c.get(Calendar.YEAR));
        int monthNumber = c.get(Calendar.MONTH);
        String month="";
        switch (monthNumber) {
            case 0:
                month="January";
                break;
            case 1:
                month= "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "Jun";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
        }
        String path = "/home/employee/Documents" + File.separator + year + File.separator + month + ".html";
        return path;
    }
    public void  persist() throws IOException {
        createNewDirectory();
        outputToFile();
    }

    private void createNewDirectory() throws IOException {
        File file = new File("/home/employee/Documents/" + monthCalendar.getDate().get(Calendar.YEAR));
        file.mkdir();
    }
    ArrayList<String> links = new ArrayList<>();
    int coun=0;

    private void outputToFile (){


        CalendarRender render = new HtmlCalendarRender();
        try
        {
            FileWriter f = new FileWriter(file);
            f.write(render.render(monthCalendar));

           // f.write("<a href="+links.get()+">");

            f.close();
            System.out.println(coun);
            links.add(file.getAbsolutePath());
            System.out.println(links.get(0));
        }
        catch (IOException e)    {
            System.out.println(e);
        }
    }
}
