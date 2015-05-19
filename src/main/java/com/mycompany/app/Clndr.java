package com.mycompany.app;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.IOException;
class Clndr {
	public static void main(String[] args) throws IOException {
		int yeartT=Integer.parseInt(args[0]);
		int monthT=Integer.parseInt(args[1]);
		Fill(monthT,yeartT);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Insert year:");
		int year= Integer.parseInt(reader.readLine());
		System.out.print("Insert month:");
		//int month= Integer.parseInt(reader.readLine());	
		String monthTmp=reader.readLine();
		int month=0;
		switch (monthTmp){
			case "Jan":
			case "January":
			case "0": month=0;
					break;
			case "Feb":
			case "February":
			case "1":	month=1;
					break;
			case "Mar":
			case "March":
			case "2": month=2;
					break;
			case "Apr":
			case "April":
			case "3": month=3;
					break;
			case "May":
			case "4": month=4;
					break;
			case "Jun":
			case "June":
			case "5": month=5;
					break;
			case "Jul":
			case "July":
			case "6":month=6;
					break;
			case "Aug":
			case "August":
			case "7": month=7;
					break;
		  	case "Sep":
			case "September":
			case "8":month=8;
					break;
			case "Oct":
			case "October":
			case "9":month=9;
					break;
			case "Nov":
			case "November":
			case "10":month=10;
					break;
			case "Dec":
			case "December":
			case "11": month=11;
					break;
		}
		Fill(month,year);
		
		
		//System.out.println(calendar.get(Calendar.MONTH)); 
	}

	public static void Fill(int month, int year){
		int[][] clndrArr= new int[6][7];
		GregorianCalendar calendar = new GregorianCalendar(year,
		month,01);
		int day=calendar.get(Calendar.DAY_OF_WEEK);
		day=-day;
 		calendar.add(Calendar.DAY_OF_MONTH,day);
 		System.out.println("\033[31mSun\tMon\tTue\tWed\tThu\tFri\tWen \033[0m");
 		for (int i=0; i < clndrArr.length; i++ ) {
			for (int j=0; j < clndrArr[i].length; j++){
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				clndrArr[i][j]=calendar.get(Calendar.DAY_OF_MONTH);
				System.out.print(clndrArr[i][j]+"\t");
			}	
			System.out.println();
		}	 
	}
}
