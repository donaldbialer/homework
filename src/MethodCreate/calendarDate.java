package MethodCreate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class calendarDate {

    public static void main(String[] args) {
        System.out.println(getCurrentDate());

    }
    public static String getCurrentDate () {
        Date myDate = new Date();
        SimpleDateFormat todayDates = new SimpleDateFormat("yyyy/MM/dd");
        String date = todayDates.format(myDate);
        //System.out.println(date);

        return date;
    }
}
