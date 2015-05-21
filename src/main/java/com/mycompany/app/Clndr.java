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

public class Clndr {
	public static void main(String[] args)  throws NullPointerException {
		InputReader reader = new InputReader();
		Calendar date = reader.getFirstDayOfMonth();
		//WeekDayType header= new WeekDayType();
		//date=reader.c;
		//Calendar c = Calendar.getInstance();
		String header="";
		for (WeekDayType weekDayType: Arrays.asList(WeekDayType.values())) {
			header += "\t" + weekDayType.toString();
		}
		System.out.println(header);
		MonthCalendar monthCalendar =new MonthCalendar(date);
		monthCalendar.createMonth();
		//System.out.println(header.toString());
		System.out.println(monthCalendar.toString());
		//WeekDay weekDay = new WeekDay(c);
		//System.out.println(weekDay.toString());
	}
}