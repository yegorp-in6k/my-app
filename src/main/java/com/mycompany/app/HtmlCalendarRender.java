package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by employee on 5/22/15.
 */
public class HtmlCalendarRender extends  AbstractCalendarRender{
    public final String TABLE_BEGIN ="<table>";
    public final String TABLE_END ="<table>";
    public final String T_ROW_BEGIN ="<tr>";
    public final String T_ROW_END ="</tr>\n";
    public final String T_DATA_BEGIN ="<td>";
    public final String T_DATA_END ="</td>\t";
    @Override
    public String getOpenDayToken(){
        return T_DATA_BEGIN;
    }
    @Override
    public  String getCloseDayToken(){
        return T_DATA_END;
    }
    @Override
    public String getOpenWeekToken(){
        return T_ROW_BEGIN;
    }
    @Override
    public String getCloseWeekToken(){
        return  T_ROW_END;
    }

    @Override
    public String render(MonthCalendar monthCalendar) {
        return "<table border=\"1\">" + super.render(monthCalendar) + "</table>";
    }
    @Override
    public String renderHead() {
        return  super.renderHead();
    }
    @Override
    public String getCloseDayColorToken() {
        return "</font color>";
    }
    @Override
    public String getOpenDayColorToken() {
        return "<font color=\"red\">";
    }
}
