package school;

public class SecondLargest {

    public static int print2largest(int[] arr, int n) {
        // code here
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        System.out.println(print2largest(arr,n));

    }

}
