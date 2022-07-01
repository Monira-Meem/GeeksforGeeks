package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatePosNegNum {

    public static void main(String[] args) {

        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for (int a : arr) {
            if (a < 0)
                negList.add(a);
            else
                posList.add(a);
        }

        int p =0, nn = 0, i =0;

        while (i < n) {

            if (p < posList.size()) {
                arr[i] = posList.get(p);
                p++;
                i++;
            }

            if (nn < negList.size()) {
                arr[i] = negList.get(nn);
                nn++;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
