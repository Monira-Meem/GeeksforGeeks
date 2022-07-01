import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int j = nums.length-1;

        for (int i =0; i <= j; i++) {
            int n = nums[i];
            nums[i] = nums[j];
            nums[j] = n;
            j--;
        }

        System.out.println(Arrays.toString(nums));

        String s = "meem";
        System.out.println(s.toUpperCase());

    }
}
