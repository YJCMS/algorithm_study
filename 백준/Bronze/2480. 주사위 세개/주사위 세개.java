import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if (a == b && a == c) {
            System.out.print(10000 + a * 1000);
        } else if (a == b && a != c || a == c && a != b) {
            System.out.print(1000 + a * 100);
        } else if (b == c && b != a) {
            System.out.print(1000 + b * 100);
        } else {
            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.print(max * 100);            
        }
    }
}