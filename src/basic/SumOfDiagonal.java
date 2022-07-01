package basic;

import java.util.Scanner;

public class SumOfDiagonal {

    static int sumDiagonal(int N, int [][] M) {
        int sum = 0;
        for (int i = 0; i <N; i++) {
            sum += M[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonal(m.length,m));


//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        String s = scanner.nextLine();
//        float f = scanner.nextInt();


        String S = "Geeks forgeeks";
        S = S.toLowerCase();
        S = S.replace(" ", "_");

        System.out.println(S);

    }

}
