import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;

        for(int i = 0; i < n; i++) {
            int count = 0;
            int a = in.nextInt();
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}