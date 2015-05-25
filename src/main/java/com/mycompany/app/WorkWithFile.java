 package com.mycompany.app;

import java.io.*;

/**
 * Created by Егор on 25.05.2015.
 */
public class WorkWithFile {
    public String[] inputFromFile(){
        String[] test = new String[0];
        try
        {
            BufferedReader infile = new BufferedReader(new FileReader("C:\\read\\readFile.txt"));
            String str;
            while ((str = infile.readLine()) != null)
            {
                test = str.trim().split("\\s+");
            }
            infile.close();
        }
        catch (IOException e)
        {
            // Exceptions ignored.
        }
        return test;
    }
    String[] test=inputFromFile();
    public String getYearStr (){
        return test[0];
    }
    public String getMonthStr (){
        return test[1];
    }
    public void outputToFile (String monthCalendar){
        try
        {
            BufferedWriter outfile = new BufferedWriter(new FileWriter("C:\\read\\"+test[1]+".html"));
            outfile.write(String.valueOf(monthCalendar));
            outfile.close();
        }
        catch (IOException e)    {    }
    }
    public void createNewFile (){
        try
        {
            File file = new File("C:\\read\\" +
                    test[1]+".html");
             file.createNewFile();
        }
        catch (IOException e)    {   }
    }
    public void createDirectory(){
        File myPath = new File("C:\\read\\"+test[0]+"\\");
        myPath.mkdir();
    }
}
