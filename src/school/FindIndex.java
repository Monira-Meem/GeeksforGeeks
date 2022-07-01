package school;

import java.util.Arrays;

public class FindIndex {

    static int[] findIndex(int a[], int N, int key)
    {
        int[] ans = new int[2];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                ans[0] = i;
                break;
            }
        }

        for (int i = N-1; i >= 0; i--) {
            if (a[i] == key) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 5 };

        System.out.println(Arrays.toString(findIndex(a,a.length,5)));

    }
}
