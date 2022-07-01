package basic;

public class BinarySearch {

    static int binarySearch(int[] arr, int n, int k) {

        int start = 0;
        int end = n-1;
        int mid = 1;

        while (start <= end) {
            mid = (start + end)/2;

            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 7;
        int n = arr.length;

        System.out.println(binarySearch(arr,n,k));

    }

}
