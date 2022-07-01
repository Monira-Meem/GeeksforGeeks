package school;

import java.util.Arrays;

public class TwoGreaterElements {

    public static void main(String[] args) {

        long[] a = {2, 8, 7, 1, 5};
        long n= a.length;

        long[] ans = new long[(int) n-2];
        Arrays.sort(a);

        for (int i = 0; i < n-2; i++) {
            ans[i] = a[i];
        }

        System.out.println(Arrays.toString(ans));

    }

}
