package medium;

import java.util.Arrays;

public class TripletSumInArray {

    public static void main(String[] args) {

        int[] A = {1, 4, 45, 6, 10, 8};
        int n = A.length;
        int X = 13;

        Arrays.sort(A);

        for (int i = 0; i < n-2; i++) {
            if (i > 0 && A[i] == A[i-1])
                continue;

            int left = i+1;
            int right = n-1;

            while (left < right){
                int currentSum = A[i] + A[left] + A[right];

                if (currentSum == X) {
                    System.out.println("Hello");
                    break;
                }  else if (currentSum < X){
                    left++;
                } else {
                    right--;
                }
            }
        }



    }

}
