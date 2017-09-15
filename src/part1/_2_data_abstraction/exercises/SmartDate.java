package part1._2_data_abstraction.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 1.2.11 Develop an implementation SmartDate of our Date API that raises an exception
 * if the date is not legal.
 *
 * 1.2.12 Add a method dayOfTheWeek() to SmartDate that returns a String value
 * Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday, giving the appropriate
 * day of the week for the date. You may assume that the date is in the 21st
 * century.
 **/

public class SmartDate {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m, int d, int y) {

        if (m < 1 || m > 12
                || d < 1 || d > 31 || y < 0) {
            throw new RuntimeException("Fake date");
        }

        month = m;
        day = d;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String dayOfTheWeek() throws ParseException {
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date date = newDateFormat.parse(toString());
        newDateFormat.applyPattern("EEEE");
        return newDateFormat.format(date);
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) throws ParseException {
        SmartDate date = new SmartDate(5, 11, 2011);
        System.out.println(date);
        date = new SmartDate(12, 11, 2011);
        date = new SmartDate(1, 31, 2031);
//        date = new SmartDate(0, 31, 2031);    // exception
//        date = new SmartDate(1, 32, 2031);    // exception
//        date = new SmartDate(1, 0, 2031);     // exception
//        date = new SmartDate(13, 5, 2031);    // exception
//        date = new SmartDate(12, 5, -5);      // exception

        date = new SmartDate(1, 1, 2001);
        System.out.println(date.dayOfTheWeek());
        date = new SmartDate(1, 31, 2001);
        System.out.println(date.dayOfTheWeek());

    }
}
