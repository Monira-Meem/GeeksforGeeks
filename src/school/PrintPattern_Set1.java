package school;

public class PrintPattern_Set1 {


    public static void main(String[] args) {

        int n = 3;

        int x = n;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k = x; k > 0; k--) {
                    System.out.print(j + " ");
                }
            }
            x--;
            System.out.print("$");
        }

    }

}
