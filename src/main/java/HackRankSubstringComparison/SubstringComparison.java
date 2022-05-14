package HackRankSubstringComparison;

import HackRankCurrencyFormatter.CurrencyFormatter;
import hackerRankQuestionDateTimeDay.findDayOfTheYear;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subWordList=new ArrayList<>();
        for(int i=0;i<s.length();i++){
           if(i+k<=s.length()){
            subWordList.add(s.substring(i,i+k));}
        }
        Collections.sort(subWordList);
        smallest=subWordList.get(0);
        largest=subWordList.get(subWordList.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
/*        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();*/

        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
