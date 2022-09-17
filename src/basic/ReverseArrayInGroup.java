package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroup {

    public static void main(String[] args) {

        //int[] arr = {1,2,3,4,5};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 3;
        int n = arr.size();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = arr.get(i);
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < n ; i += k) {

            int start = i;
            int end = Math.min(i+k-1, n-1);

            while (start < end) {
                int num = nums[start];
                nums[start] = nums[end];
                nums[end] = num;
                start++;
                end--;
            }
        }

        System.out.println(Arrays.toString(nums));

        arr.clear();

        for(int nn : nums) {
            arr.add(nn);
        }

        System.out.println(arr);


    }
}
