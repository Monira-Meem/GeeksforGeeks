package basic;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Geeks";

        int i = 0;
        int j = str.length()-1;

        char[] chars = str.toCharArray();

        while (i < j) {

            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }

        String s = new String(chars);
        System.out.println(s);

    }


}
