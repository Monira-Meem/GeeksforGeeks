package medium;

public class Kadanes_Algorithm {

    static long maxSubarraySum(int arr[], int n){

        // Your code here

        long currentMaxSum = arr[0];
        long maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            currentMaxSum = Math.max(num, currentMaxSum + num);
            maxSum = Math.max(maxSum,currentMaxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] numbers = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        int n = numbers.length;


        System.out.println(maxSubarraySum(numbers,n));

    }

}
