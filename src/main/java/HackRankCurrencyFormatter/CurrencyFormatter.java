package HackRankCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public void currencyConverter(double d){

        String formatIndian = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(d);
        String formatFrench = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);
        String formatUs = NumberFormat.getCurrencyInstance(Locale.US).format(d);
        String formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
        System.out.println("formatFrench"+formatFrench);
        System.out.println("formatIndian"+formatIndian);
        System.out.println("formatUs"+formatUs);
        System.out.println("formatChina"+formatChina);


    }
}
