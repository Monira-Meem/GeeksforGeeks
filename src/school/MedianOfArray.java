package school;

import java.util.Arrays;

public class MedianOfArray {

    public static int find_median(int[] v)
    {
        int mid = 0;
        int ans = 0;
        int length = v.length;

        Arrays.sort(v);

        if (length % 2 != 0) {
            return v[length/2];
        } else {
            mid = length/2;
            ans = (v[mid-1] + v[mid])/2;
        }
        return ans;
    }
}
