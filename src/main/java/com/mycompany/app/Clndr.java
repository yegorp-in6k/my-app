package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.lang.NullPointerException;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clndr {
	public static void main(String[] args)  throws NullPointerException {
		InputReader reader = new InputReader();
		Calendar date = Calendar.getInstance();
		date=reader.c;
		MonthCalendar monthCalendar =new MonthCalendar(date);
		monthCalendar.createMonth();
		monthCalendar.toString();
	}
}