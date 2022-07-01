package school;

public class ArmstrongNumbers {

    static int armstrongNumber(int n){

        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int mod = temp % 10;
            sum = sum + (mod * mod * mod);
            temp = temp /10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
        System.out.println(armstrongNumber(370));
        System.out.println(armstrongNumber(101));
    }

}
