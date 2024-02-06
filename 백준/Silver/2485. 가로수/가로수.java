import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;

        for(int i = 0; i < n-1; i++) {
            int distance = arr[i+1] - arr[i];
            gcd = gcd(distance, gcd);
        }

        StringBuilder sb = new StringBuilder();

        sb.append((arr[n-1]-arr[0])/gcd+1-(arr.length)).append('\n');

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}