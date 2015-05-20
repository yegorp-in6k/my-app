package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clndr {
	public static void main(String[] args) throws IOException {
		// int yeartT=Integer.parseInt(args[0]);
		// int monthT=Integer.parseInt(args[1]);
		//Fill(monthT,yeartT);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Insert year:");
		int year= Integer.parseInt(reader.readLine());
		System.out.print("Insert month:");
		String monthStr=reader.readLine();
		//int month =0 ;
		while (checkMonth(monthStr)==false){
			System.out.println("You insert month wrong!!!Try something like that:10|Oct|October");
			System.out.print("Insert year:");
			year= Integer.parseInt(reader.readLine());
			System.out.print("Insert month:");
			monthStr= reader.readLine();
		}
		createCalendar(year, monthStr);
	}

	private static void createCalendar(int year, String monthStr) {
		switch (monthStr) {
			case "Jan":
			case "January":
			case "1":
				//month = 0;
				fillCalendarArr(0,year);
				break;
			case "Feb":
			case "February":
			case "2":
				//month = 1;
				fillCalendarArr(1, year);
				break;
			case "Mar":
			case "March":
			case "3":
				//month = 2;
				fillCalendarArr(2,year);
				break;
			case "Apr":
			case "April":
			case "4":
				//month = 3;
				fillCalendarArr(3,year);
				break;
			case "May":
			case "5":
				//month = 4;
				fillCalendarArr(4,year);
				break;
			case "Jun":
			case "June":
			case "6":
				//month = 5;
				fillCalendarArr(5,year);
				break;
			case "Jul":
			case "July":
			case "7":
				//month = 6;
				fillCalendarArr(6,year);
				break;
			case "Aug":
			case "August":
			case "8":
				//month = 7;
				fillCalendarArr(7,year);
				break;
			case "Sep":
			case "September":
			case "9":
				//month = 8;
				fillCalendarArr(8,year);
				break;
			case "Oct":
			case "October":
			case "10":
				//month = 9;
				fillCalendarArr(9,year);
				break;
			case "Nov":
			case "November":
			case "11":
				//month = 10;
				fillCalendarArr(10,year);
				break;
			case "Dec":
			case "December":
			case "12":
				//month = 11;
				fillCalendarArr(11,year);
				break;
		}
	}

	public static boolean checkMonth(String testString) {
		Pattern p = Pattern.compile("^Jun|June|1|Feb|February|2|Mar|March|3|Apr|April|4|May|5|Jun|June|6|Jul|July|7|Aug|August|8|Sep|September|9|Oct|October|10|Nov|November|11|Dec|December|12$");
		Matcher m = p.matcher(testString);
		return m.matches();
	}
	public static void fillCalendarArr(int month, int year){
		int[][] clndrArr= new int[6][7];
		GregorianCalendar calendar = new GregorianCalendar(year, month, 01);
		GregorianCalendar today = new GregorianCalendar();
		int day=calendar.get(Calendar.DAY_OF_WEEK);
		day=-day;
		calendar.add(Calendar.DAY_OF_MONTH,day);
		System.out.println("\033[32mSun\tMon\tTue\tWed\tThu\tFri\tWen \033[0m");
		for (int i=0; i < clndrArr.length; i++ ) {
			for (int j=0; j < clndrArr[i].length; j++){
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				if (calendar.get(Calendar.MONTH)==today.get(Calendar.MONTH)&&calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH)){
					clndrArr[i][j]=calendar.get(Calendar.DAY_OF_MONTH);
					System.out.print("\033[33m" + clndrArr[i][j] + "\t\033[0m");
				}else {
					clndrArr[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
					if (j==0){
						System.out.print("\033[31m"+clndrArr[i][j]+"\t\033[0m");
					}
					else if(j==6){
						System.out.print("\033[31m"+clndrArr[i][j]+"\t\033[0m");
					}
					else{
						System.out.print(clndrArr[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}