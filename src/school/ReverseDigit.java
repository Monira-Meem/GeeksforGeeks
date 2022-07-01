package school;

public class ReverseDigit {

    public static void main(String[] args) {

        long n = 123450000l;

        String ns = Long.toString(n);
        Long rvn = Long.reverse(n);
        //System.out.println(rvn);

        long ans = 0;

        while (n != 0) {
            long mod = n % 10;
            ans = mod + ans * 10;
            n = n/10;
        }

        System.out.println(ans);
    }

}
