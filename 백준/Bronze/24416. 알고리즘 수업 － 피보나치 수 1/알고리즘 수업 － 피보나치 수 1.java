import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static int count1, count2;
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f = new int[n];
        count1 = 0;
        count2 = 0;

        fib(n);
        fibonacci(n);

        System.out.println(count1 + " " + count2);

    }

    static int fib(int n) {
        if(n == 1 || n == 2) {
            count1++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++) {
            count2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];
    }
}