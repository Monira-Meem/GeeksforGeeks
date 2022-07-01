package school;

public class GCD {

    public static int gdcRecursion(int A, int B){
        if (B % A == 0)
            return A;
        else
            return gdcRecursion(B % A,A);
    }
}
