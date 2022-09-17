package basic;

import java.util.HashSet;

public class UnionOfTwoArray {

    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();

        for (int aa : a){
            set.add(aa);
        }
        for (int bb : b) {
            set.add(bb);
        }
        return set.size();
    }

    public static void main(String[] args) {



    }
}
