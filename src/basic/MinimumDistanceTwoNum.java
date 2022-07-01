package basic;

public class MinimumDistanceTwoNum {

    static int findIndex(int[] a, int n, int x, int y) {

        int startIndex = -1;
        int endIndex = -1;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (a[i] == x) {
                startIndex = i;
            }
            if (a[i] == y) {
                endIndex = i;
            }
            if (startIndex != -1 && endIndex != -1) {
                int diff = Math.abs(endIndex - startIndex);
                min = Math.min(min, diff);
            }
        }
        if (min == Integer.MAX_VALUE || min == 0)
            return -1;

        return min;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,2};
        int n = a.length;
        int x = 1;
        int y = 2;

        System.out.println(findIndex(a,n,x,y));

    }
}
