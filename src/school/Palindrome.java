package school;

public class Palindrome {

    public static void main(String[] args) {

        int n = 123;

        int temp = n;
        int rev = 0;

        while (temp != 0) {
            int mod = temp % 10;
            rev = mod + rev * 10;
            temp = temp / 10;
        }

        System.out.println(rev);

    }
}
