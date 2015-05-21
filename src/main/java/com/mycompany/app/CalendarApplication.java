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
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		InputReader inputReader = new InputReader();

		if (args.length==0){
			System.out.println("Please input numbers!!");
			try {
				inputReader.inputFromKeybord();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			inputReader = new InputReader(args[0],args[1]);
		}

		Calendar date = inputReader.getDate();
		MonthCalendar monthCalendar =new MonthCalendar(date);
		System.out.println("Chose type calendar output:\n" +
				"1.Text calendar\n" +
				"2.Calendar with HTML tags\n"+
				"Your choice is:");
		int choiceOfOutput=0;
		try {
			choiceOfOutput=Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (choiceOfOutput){
			case 1:
				System.out.println(monthCalendar.printHeader());
				System.out.println(monthCalendar.toString());
				break;
			case 2:
				System.out.println("<table>"+"<tr>"+monthCalendar.printHeaderHtml()+"</tr>"+"</table>");
				System.out.println("<table>"+monthCalendar.toStringHtml()+"</table>");

				break;
		}




	}

}