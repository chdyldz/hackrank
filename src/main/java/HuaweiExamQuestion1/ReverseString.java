package HuaweiExamQuestion1;

public class ReverseString {
    //take 2 parameter input string, k int, reverse every  k word in every 2k char in input string; example abcdefg -> bacdfeg
    public static void main(String[] args) {
        String abcdefg = reverseStr("abcdefg", 2);
        System.out.println(abcdefg);


    }

    public static String reverseStr(String s, int k) {
        int length = s.length();
        if(length <= k){
            return new StringBuilder(s).reverse().toString();
        } else if(length > k && length <= 2 * k){
            return new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
        }
        else{
            return new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k, 2 * k) + reverseStr(s.substring(2 * k), k);
        }
    }

}
