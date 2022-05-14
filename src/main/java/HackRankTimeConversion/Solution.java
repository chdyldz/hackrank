package HackRankTimeConversion;


import java.io.*;
import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String time) {
        String pattern12h = "hh:mm:ss a";
        String pattern24h = "HH:mm:ss";
        DateTimeFormatter dateTimeFormatter12h = DateTimeFormatter.ofPattern(pattern12h);
        DateTimeFormatter dateTimeFormatter24h = DateTimeFormatter.ofPattern(pattern24h);
        LocalTime parsedTime = LocalTime.parse(time, dateTimeFormatter12h);
        String timeIn24h = parsedTime.format(dateTimeFormatter24h);

        return timeIn24h;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {

        String pattern12h = "hh:mm:ss a";
        String pattern24h = "HH:mm:ss";
        String time = "07:05:45 PM";
        DateTimeFormatter dateTimeFormatter12h = DateTimeFormatter.ofPattern(pattern12h);
        DateTimeFormatter dateTimeFormatter24h = DateTimeFormatter.ofPattern(pattern24h);
        LocalTime parsedTime = LocalTime.parse(time, dateTimeFormatter12h);
        System.out.println(parsedTime.format(dateTimeFormatter12h));
        String timeIn24h = parsedTime.format(dateTimeFormatter24h);
        System.out.println(timeIn24h);


    }
}
