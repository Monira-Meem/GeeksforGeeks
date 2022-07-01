package easy;

import java.util.Arrays;

public class MaxMin {

    public static int findSum(int[] A, int N)
    {
        int sum = 0;

        int max = A[0];
        int min = A[0];

        for (int a :A ) {
            if ( a > max) {
                max = a;
            }

            if (a < min) {
                min = a;
            }
        }
        sum = max + min;

        return max + min;
    }


    public static void main(String[] args) {

    }
}
