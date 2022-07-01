package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] a = {3,1,3,3,2};
        int size = a.length;
        Arrays.sort(a);

        int maxElement = -1;

        Map<Integer,Integer> map = new HashMap<>();

        for (int n : a) {
            if (map.containsKey(n)) {
                int count = map.get(n);
                count++;
                map.put(n,count);
            } else {
                map.put(n,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > size /2) {
                maxElement = entry.getKey();
            }
        }

        System.out.println(maxElement);

    }
}
