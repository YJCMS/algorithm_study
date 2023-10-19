import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] result = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            for (int j = 0; j < 26; j++) {
                char c2 = a.charAt(j);
                if (c1 == c2 && result[j] == -1) result[j] = i;
            }
        }

        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}
