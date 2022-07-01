package basic;

import java.util.ArrayList;

public class FirstAndLastOccurrences {


   static ArrayList<Long> find(long[] arr, int n, int x)
    {
        ArrayList<Long> list = new ArrayList<>();
        list.add(first(arr,n,x));

        if (list.get(0) == -1)


        list.add(last(arr,n,x));
        return list;
    }

    static long first(long[] arr, int n, int x) {
        long mid = 0;
        long start = 0;
        long end = n-1;
        long ans = -1;

        while (start <= end) {
            mid = (start + end) /2;

            if (arr[(int) mid] == x) {
               ans = mid;
               end = mid - 1;
            } else if (arr[(int) mid] > x) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return ans;
    }

    static long last(long[] arr, int n, int x) {
        long mid = 0;
        long start = 0;
        long end = n-1;
        long ans = -1;

        while (start <= end) {
            mid = (start + end) /2;

            if (arr[(int) mid] == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr[(int) mid] > x) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

       long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
       int n = arr.length;
       int x = 5;


       System.out.println(find(arr,n,x));

    }

}
