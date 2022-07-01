import java.util.HashMap;
import java.util.Map;

public class Convert_5 {

    public static int reverseNum(int temp){
        int ans =0;
        while (temp > 0){
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp /10;
        }
        return ans;
    }

    public static int converted(int num){

        String s = String.valueOf(num);

        if(!s.contains("0"))
            return num;

        if (num == 0)
            return 5;

        int temp = 0;
        while (num > 0){
            int digit = num % 10;
            if( digit == 0)
                digit = 5;
            temp = temp * 10 + digit;
            num = num/10;
        }
        return reverseNum(temp);
    }

    public static void main(String[] args) {
        System.out.println(converted(121));
        Map<Integer,Integer> map = new HashMap<>();
    }

}
