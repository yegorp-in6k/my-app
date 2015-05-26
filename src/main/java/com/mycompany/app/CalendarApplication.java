package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CalendarApplication {
	public static void main(String[] args) throws IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		InputReader inputReader = new InputReader();

		/*if (args.length==0){
			System.out.println("Please input numbers!!");
			try {
				inputReader.inputFromKeybord();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			inputReader = new InputReader(args[0],args[1]);
		}*/
		Calendar date = inputReader.getDate();
		MonthCalendar monthCalendar = new MonthCalendar(date);
		System.out.println("Chose type calendar output:\n" +
				"1.Text calendar\n" +
				"2.Calendar with HTML tags\n"+
				"Your choice is:");
		int choiceOfOutput = 0;
		try {
			choiceOfOutput=Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		CalendarRender render;
		switch (choiceOfOutput){
			case 1:
				render = new ConsoleCalendar();
				System.out.println(render.render(monthCalendar));
				break;
			case 2:
				render = new HtmlCalendarRender();
				System.out.println(render.render(monthCalendar));
				break;
			case 3:
				CustomCalendar customCalendar = new CustomCalendar();
				customCalendar.inputFromFile();
				customCalendar.persist();
				break;
		}


	}

}