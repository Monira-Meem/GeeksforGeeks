package school;

import java.util.ArrayList;

public class ValueEqualToIndex {

    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == i+1) {
                list.add(num);
            }
        }
        return list;
    }

}
