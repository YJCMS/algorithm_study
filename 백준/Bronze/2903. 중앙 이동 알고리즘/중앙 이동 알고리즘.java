import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 2;
        
        for(int i = 1; i <= n; i++) {
            a += (a-1);
        }
        
        System.out.print(a*a);
    }
}