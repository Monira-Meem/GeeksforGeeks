package basic;

public class ThirdLargestElement {

   static int thirdLargest(int[] a, int n)
    {
        if (n <= 2)
            return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int x : a) {

            if (x >= first){
                third = second;
                second = first;
                first = x;
            } else if (x > second) {
                third = second;
                second = x;
            } else if (x > third) {
                third = x;
            }
        }
        return third;
    }

    public static void main(String[] args) {

        int[] a = {2,4,1,3,5};
        int n = a.length;

        System.out.println(thirdLargest(a,n));

    }

}
