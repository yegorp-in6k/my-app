 package com.mycompany.app;

import java.io.*;
import java.util.ArrayList;

 /**
 * Created by Егор on 25.05.2015.
 */
public class CustomCalendar {
    ArrayList<Year> years = new ArrayList<>();
    public void inputFromFile(){
        //String[] calendarValues = new String[0];

        try
        {
            BufferedReader infile = new BufferedReader(new FileReader("/home/employee/Documents/readThisFile.txt"));
            String str;
            while ((str = infile.readLine()) != null)
            {
                Year year = new Year(str.trim().split("\\s+"));
                years.add(year);
            }
            infile.close();
        }
        catch (IOException e)
        {
        }
    }

     public void persist() throws IOException {
         for (Year year : years){
             year.persist();
         }
     }
 }
