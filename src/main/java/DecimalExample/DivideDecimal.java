package DecimalExample;

import java.math.BigDecimal;
import java.math.MathContext;

public class DivideDecimal {
    public static void main(String[] args) {
        int val1=1005001;
        int val2=9000;

        MathContext mc= new MathContext(2);
        BigDecimal result=BigDecimal.valueOf(val2).divide(BigDecimal.valueOf(val1),mc);
       // System.out.println(result.doubleValue());
        System.out.println((double)val2/val1);
        System.out.println(((double)val2/val1)*100);
       // System.out.println(result.doubleValue()*100);
    }
}
