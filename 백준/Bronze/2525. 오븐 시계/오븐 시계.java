import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        A += C/60;
        B += C%60;

        if (B >= 60) {
            A += 1;
            B -= 60;
        }

        if (A >= 24) {
            A -= 24;
        }

        System.out.println(A + " " + B);

    }
}