import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int min = 0;
        int result = 0;

        for(int i = n; i >= m; i--) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                min = i;
                result += i;
            }
        }

        if(result == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
            System.out.println(min);
        }
    }
}