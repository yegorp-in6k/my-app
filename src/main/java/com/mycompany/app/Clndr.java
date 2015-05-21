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
	public static void main(String[] args) throws NullPointerException, IOException {
		InputReader reader = new InputReader();
		reader.inputFromKeybord();
		Calendar date = reader.getDate();
		MonthCalendar monthCalendar =new MonthCalendar(date);
		monthCalendar.createMonth();
		System.out.println(monthCalendar.printHeader());
		System.out.println(monthCalendar.toString());
	}
}