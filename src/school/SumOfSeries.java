package school;

public class SumOfSeries {

    static long seriesSum(int n) {

        if (n == 1)
            return 1;
        long first = 1;
        return ((first + n) * n) / 2;
    }

    public static void main(String[] args) {

       // System.out.println(seriesSum(4));

    }

}
