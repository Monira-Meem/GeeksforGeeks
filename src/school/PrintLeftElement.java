package school;

import java.util.Arrays;

public class PrintLeftElement {

    public static void main(String[] args) {

        long[] arr = {7, 8, 3, 4, 2, 9, 5};
        long n = arr.length;

        Arrays.sort(arr);

        long mid = n /2L;

        if (n % 2 == 0) {
            System.out.println(arr[(int) ((n/2) -1)]);
        } else {
            System.out.println(arr[(int) (n/2)]);
        }


    }
}
