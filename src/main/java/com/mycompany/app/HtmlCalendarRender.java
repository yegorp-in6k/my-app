package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by employee on 5/22/15.
 */
public class HtmlCalendarRender implements CalendarRender {

    public String render(MonthCalendar monthCalendar) {
        String result="";
        //weeks = monthCalendar.getWeeks();
        //weekDays = weeks.get(day).getDays();
        for (Week week : monthCalendar.getWeeks()){
            //System.out.println(week.toString());
            for (WeekDay day : week.getDays()){
                result +="<td>"+day+"</td>"+"\t";
            }
            result=result+"\n"+"</tr>"+"<tr>";
        }
        return "<table>"+"<tr>"+result+"</tr>"+"</table>";
    }
}
