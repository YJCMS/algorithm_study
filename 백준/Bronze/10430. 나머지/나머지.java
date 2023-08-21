import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        System.out.printf("%d\n%d\n%d\n%d", (A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C);
    }
}