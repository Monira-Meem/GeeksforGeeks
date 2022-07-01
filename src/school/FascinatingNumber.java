package school;

import java.util.Arrays;

public class FascinatingNumber {

    static boolean fascinating(long n) {

        if (n > 1000) {
            return false;
        }

        long mul2 = n *2;
        long mul3 = n *3;

        String s = n + "" + mul2 + "" + mul3;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);


        return false;
    }

    public static void main(String[] args) {

        long n = 192;


        long mul2 = n *2;
        long mul3 = n *3;

        String s = n + "" + mul2 + "" + mul3;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char[] res = {'1', '2', '3','4','5', '6', '7', '8','9'};

        if (Arrays.equals(res, chars))
            System.out.println("Yes");

        System.out.println(Arrays.toString(chars));


    }

}
