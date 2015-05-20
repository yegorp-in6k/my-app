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
		int year= 2015;
		String monthStr="Jan";
		do {
			System.out.println("You insert month wrong!!!Try something like that:10|Oct|October");
			System.out.print("Insert year:");
			year= Integer.parseInt(reader.readLine());
			System.out.print("Insert month:");
			monthStr= reader.readLine();
		}while (checkMonth(monthStr)==false)
		createCalendar(year, monthStr);
	}

	private static void createCalendar(int year, String monthStr) {
		int month = getMonth(monthStr);
		fillCalendarArr(month,year);
	}

	private static int getMonth(String monthStr) {
		int month=0;
		switch (monthStr) {
			case "Jan":
			case "January":
			case "1":
				month = 0;
				break;
			case "Feb":
			case "February":
			case "2":
				month = 1;
				break;
			case "Mar":
			case "March":
			case "3":
				month = 2;
				break;
			case "Apr":
			case "April":
			case "4":
				month = 3;
				break;
			case "May":
			case "5":
				month = 4;
				break;
			case "Jun":
			case "June":
			case "6":
				month = 5;
				break;
			case "Jul":
			case "July":
			case "7":
				month = 6;
				break;
			case "Aug":
			case "August":
			case "8":
				month = 7;
				break;
			case "Sep":
			case "September":
			case "9":
				month = 8;
				break;
			case "Oct":
			case "October":
			case "10":
				month = 9;
				break;
			case "Nov":
			case "November":
			case "11":
				month = 10;
				break;
			case "Dec":
			case "December":
			case "12":
				month = 11;
				break;
		}
		return month;
	}

	public static boolean checkMonth(String testString) {
		Pattern p = Pattern.compile("^Jun|June|1|Feb|February|2|Mar|March|3|Apr|April|4|May|5|Jun|June|6|Jul|July|7|Aug|August|8|Sep|September|9|Oct|October|10|Nov|November|11|Dec|December|12$");
		Matcher m = p.matcher(testString);
		return m.matches();
	}
	public static void fillCalendarArr(int month, int year){
		int[][] clndrArr= new int[6][7];
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,1);
		GregorianCalendar today = new GregorianCalendar();
		int day=calendar.get(Calendar.DAY_OF_WEEK);
		day=-day;
		calendar.add(Calendar.DAY_OF_MONTH,day);
		System.out.println("\033[32mSun\tMon\tTue\tWed\tThu\tFri\tWen \033[0m");
		for (int rowOfArr=0;rowOfArr < clndrArr.length; rowOfArr++ ) {
			for (int columnOfArr=0; columnOfArr < clndrArr[rowOfArr].length; columnOfArr++){
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				if (calendar.get(Calendar.MONTH)==today.get(Calendar.MONTH)&&calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH)){
					currentDayWithColor(clndrArr, calendar, rowOfArr, columnOfArr);
				}else {
					elseDaysWithColorfullWeekends(clndrArr, calendar, rowOfArr, columnOfArr);
				}
			}
			System.out.println();
		}
	}

	private static void elseDaysWithColorfullWeekends(int[][] clndrArr, GregorianCalendar calendar, int rowOfArr, int columnOfArr) {
		clndrArr[rowOfArr][columnOfArr] = calendar.get(Calendar.DAY_OF_MONTH);
		if (columnOfArr==0){
            System.out.print("\033[31m"+clndrArr[rowOfArr][columnOfArr]+"\t\033[0m");
        }
        else if(columnOfArr==6){
            System.out.print("\033[31m"+clndrArr[rowOfArr][columnOfArr]+"\t\033[0m");
        }
        else{
            System.out.print(clndrArr[rowOfArr][columnOfArr]+"\t");
        }
	}

	private static void currentDayWithColor(int[][] clndrArr, GregorianCalendar calendar, int rowOfArr, int columnOfArr) {
		clndrArr[rowOfArr][columnOfArr]=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.print("\033[33m" + clndrArr[rowOfArr][columnOfArr] + "\t\033[0m");
	}
}