package arrays;

public class PalindromeArray {

    public static boolean isPalindrome(int num) {

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int mod = temp % 10;
            sum = mod + sum*10;
            temp = temp /10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        int[] a = {111, 222, 333, 444, 555};

        for (int n : a) {
            if (!isPalindrome(n)){
                System.out.println(0);
                break;
            }
        }




    }

}
