package school;

public class DeleteAlternateCharacter {

    public static void main(String[] args) {

        String S = "GeeksforGeeks";
        char[] ans = new char[S.length()/2 + 1];
        int j = 0;

        for (int i = 0 ; i < S.length(); i+=2) {
            ans[j] = S.charAt(i);
            j++;
        }
        System.out.println(new String(ans));
    }
}
