package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.lang.NullPointerException;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalendarApplication {
	public static void main(String[] args) {
	InputReader reader = new InputReader();

		if (args.length==0){
			System.out.println("Please input numbers!!");
			try {
				reader.inputFromKeybord();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			reader = new InputReader(args[0],args[1]);
		}

		Calendar date = reader.getDate();
		MonthCalendar monthCalendar =new MonthCalendar(date);
		System.out.println(monthCalendar.printHeader());
		System.out.println(monthCalendar.toString());

		System.out.println("<table>"+monthCalendar.printHeader()+"</table>");
		System.out.println("<table>"+monthCalendar.toStringHtml()+"</table>");
	}

}