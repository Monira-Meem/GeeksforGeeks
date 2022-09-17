package basic;

import java.util.Arrays;

public class CyclicallyRotate {

    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        int[] copied = arr.clone();
        int n = arr.length;

        int last = arr[n-1];

        for (int i = 0; i < n-1; i++) {
            arr[i+1] = copied[i] ;
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));

    }
}
