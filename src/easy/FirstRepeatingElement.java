package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for (int a : arr) {
            if (map.containsKey(a)) {
                int count = map.get(a);
                count++;
                map.put(a,count);
            } else {
                map.put(a,1);
            }
        }
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if (map.get(current) >= 2)
                ans = i+1;
        }
    }

}
