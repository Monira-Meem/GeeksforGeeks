package school;

import java.util.Arrays;

public class ReverseAString {

    public static String reverseString(String S) {

        int j = S.length()-1;
        char[] chars = new char[S.length()];

        for (int i  = 0; i < S.length()/2; i++) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j]= c;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("monira"));

        String S1 = "Geeks";
        String S2 = "forGeeks";

        String ans = reverseString(S1).concat(reverseString(S2));
        System.out.println(reverseString(S1));
        System.out.println(ans);

    }

}
