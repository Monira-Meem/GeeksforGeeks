package school;

public class SumOfArray {

    public long getSum(long[] a, long n)
    {
        long sum = 0;

        for (long num : a) {
            sum += num;
        }
        return sum;
    }
}
