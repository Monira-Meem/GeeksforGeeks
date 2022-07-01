package school;

public class PerfectArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int n = a.length;

        int i = 0;
        int j = n -1;

        while (i < j) {
            if (a[i] != a[j]) {
                System.out.println("NOT PERFECT");
                break;
            }
            i++;
            j--;
        }

    }
}
