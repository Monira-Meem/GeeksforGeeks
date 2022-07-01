package school;

public class PartyOfCouples {

    static int findSingle(int N, int[] arr){

        int ans = 0;

        for (int a : arr) {
            ans ^= a;
        }
        return ans;
    }
}
