import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();

        if (M < 45) {
           if (H == 0) {
               H = 23;
           } else {
               H = H - 1;
           }
            M = M + 60 - 45;
            System.out.print(H + " " + M );
        } else {
            M = M - 45;
            System.out.print(H + " " + M);
        }
    }
}