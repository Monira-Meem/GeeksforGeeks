public class Peak_Element {

    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 15};
        //int[] arr = {10, 20, 15, 2, 23, 90, 67};
        int n = arr.length;

        int ans = 0;

//        if(n == 0 || n == 1){
//            ans = 0;
//        }

        int start= 0;
        int end = n -1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        ans = start;

        System.out.println(ans);

    }

}
