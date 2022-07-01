package arrays;

import java.util.Arrays;

public class WaveArray {

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,7,8,9,10};
        int n = arr.length;

        for (int i = 0; i<n-1; i+=2){
            swap(arr,i,i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
