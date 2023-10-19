import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.next();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            char c = a.charAt(i);
            result += c - '0';
        }
       
        System.out.print(result);
    }
}