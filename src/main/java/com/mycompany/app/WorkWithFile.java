 package com.mycompany.app;

import java.io.*;

/**
 * Created by Егор on 25.05.2015.
 */
public class WorkWithFile {
    public String[] inputFromFile(){
        String[] calendarValues= new String[0];
        try
        {
            BufferedReader infile = new BufferedReader(new FileReader("C:\\read\\readFile.txt"));
            String str;
            while ((str = infile.readLine()) != null)
            {
                calendarValues = str.trim().split("\\s+");
            }
            infile.close();
        }
        catch (IOException e)
        {
        }
        return calendarValues;
    }
    String[] valuesFromFile=inputFromFile();
    public String getYearStr (){
        return valuesFromFile[0];
    }
    public String getMonthStr (){
        return valuesFromFile[1];
    }
    public void outputToFile (String monthCalendar){
        try
        {
            BufferedWriter outfile = new BufferedWriter(new FileWriter("C:\\read\\"+valuesFromFile[1]+".html"));
            outfile.write(String.valueOf(monthCalendar));
            outfile.close();
        }
        catch (IOException e)    {    }
    }
    public void createNewFile (){
        try
        {
            File file = new File("C:\\read\\" +
                    valuesFromFile[1]+".html");
             file.createNewFile();
        }
        catch (IOException e)    {   }
    }
    public void createNewDirectory() throws IOException {
        File file = new File("C:\\read\\" + valuesFromFile[0] + "\\");
        file.mkdir();
    }
}
