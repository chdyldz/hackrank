package hackerRankQuestionDateTimeDay;

import java.util.Calendar;

public class findDayOfTheYear {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        switch (calendar.getTime().getDay()){//Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
            case 0:return "SUNDAY";
            case 1:return "Monday".toUpperCase();
            case 2:return "Tuesday".toUpperCase();
            case 3:return "Wednesday".toUpperCase();
            case 4:return "Thursday".toUpperCase();
            case 5:return "Friday".toUpperCase();
            case 6:return "Saturday".toUpperCase();
        }
        return null;
    }
}
