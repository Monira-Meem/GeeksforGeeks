package easy;

public class FindTransitionPoint {

    public static void main(String[] args) {

        int[] arr = {0,0,0,0,0,1,1,1,1,1};
        int n = arr.length;

        int start = 0;
        int end = n-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == 1) {
                ans = mid;
                end = mid -1;
            } else {
                start = mid +1;
            }
        }

        System.out.println(ans);

    }
}
