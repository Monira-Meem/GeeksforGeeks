package easy;

public class BitonicPoint {

    public static void main(String[] args) {

        int[] arr = {1,15,25,45,42,21,17,12,11};
        int n = arr.length;

        int i = 0;
        int j = n-1;
        int max = Integer.MIN_VALUE;

        while (i <= j) {
            int mid = (i+j)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
                max = arr[mid];
            else {
                if(arr[mid] < arr[mid+1])
                    i = mid+1;
                else
                    j = mid-1;
            }


//            if (arr[mid] < arr[mid -1]) {
//                j = mid -1;
//            } else if (arr[mid] < arr[mid +1] ) {
//                i = mid +1;
//            } else {
//                max = arr[mid];
//            }
        }

        System.out.println(max);

    }

}
