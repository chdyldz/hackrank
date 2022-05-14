package HackRankPlusMinus;

import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        Predicate<Integer> minus = i -> (i < 0);
        Predicate<Integer> plus = i -> (i > 0);
        Predicate<Integer> zero = i -> (i == 0);
        List<Integer> minusList = arr.stream().filter(minus).collect(toList());
        List<Integer> plusList = arr.stream().filter(plus).collect(toList());
        List<Integer> zeroList = arr.stream().filter(zero).collect(toList());
        System.out.println(String.format("%.5f",(double) plusList.size()/ arr.size()));
        System.out.println(String.format("%.5f",(double) minusList.size()/ arr.size()));
        System.out.println(String.format("%.5f",(double) zeroList.size()/ arr.size()));

    }

}

public class PlusMinus {
    public static BiConsumer<Integer, Runnable> repeat = (n, f) -> {
        for (int i = 1; i <= n; i++)
            f.run();
    };
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr=new ArrayList<>();

        repeat.accept(n,()-> {
            try {
              arr.add(Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", "")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
