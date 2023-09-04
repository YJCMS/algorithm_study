import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            result += a * b;
        }

        if (result == x) System.out.println("Yes");
        else System.out.println("No");

    }
}