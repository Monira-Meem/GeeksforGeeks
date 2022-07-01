package school;

import java.util.Arrays;

public class CountTypeOfChar {

    public static void main(String[] args) {

        String s = "*GeEkS4GeEkS*";

        int[] ans = new int[4];

        for (char a : s.toCharArray()) {
            if (a >= 'A' && a <= 'Z')
                ans[0]++;
            else if (a >= 'a' && a <= 'z')
                ans[1]++;
            else if (a >= '0' && a <= '9')
                ans[2]++;
            else
                ans[3]++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
