package HackRankInterface;

public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int result=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                result=result+i;
        }
        return result;
    }
}
