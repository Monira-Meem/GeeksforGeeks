package school;

public class SmallerAndLarger {

    int[] getMoreAndLess(int[] arr, int n, int x) {
        int[] ans = new int[2];

        for (int a : arr) {
            if (a <= x) {
                ans[0]++;
            } else
                ans[1]++;
        }
        return ans;
    }
}
