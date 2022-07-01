package medium;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        int n = arr.length;

        int total = 0;

        int[] leftMaxs = new int[n];
        int[] rightMaxs = new int[n];

        int leftMax = 0;

        for (int i = 0; i < n; i++) {
            int height = arr[i];
            leftMaxs[i] = leftMax;
            leftMax = Math.max(leftMax,height);
        }
        System.out.println(Arrays.toString(leftMaxs));

        int rightMax = 0;

        for (int i = n-1; i >= 0; i--) {
            int height = arr[i];
            rightMaxs[i] = rightMax;
            rightMax = Math.max(rightMax,height);
        }
        System.out.println(Arrays.toString(rightMaxs));


        int[] waters = new int[n];

        for (int i = 0; i < n; i++) {

            int height = arr[i];
            int minHeight = Math.min(leftMaxs[i],rightMaxs[i]);
            int water = 0;
            if (height < minHeight) {
                water = minHeight - height;
            }
            waters[i] = water;
            total += water;
        }

        System.out.println(Arrays.toString(waters));
        System.out.println(total);
    }

}
