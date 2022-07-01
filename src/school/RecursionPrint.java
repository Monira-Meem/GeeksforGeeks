package school;

public class RecursionPrint {

    static void printTillN(int N){

        if(N>1) {
            printTillN(N - 1);

        }
        System.out.print(N+" ");
    }

    public static void main(String[] args) {

        printTillN(10);
    }


}
