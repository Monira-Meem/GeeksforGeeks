package easy;

public class MissingNumber {

    public static void main(String[] args) {

        int[] array = {1,2,4};
        int n = 4;

        int sum = 0;

        for (int a : array) {
            sum += a;
        }
        int totalSum = n * (n +1)/2;

        int ans = totalSum - sum;
        System.out.println(totalSum);
        System.out.println(ans);

    }

}
