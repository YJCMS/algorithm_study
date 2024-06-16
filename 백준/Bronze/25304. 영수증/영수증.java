import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            result += a * b;
        }

        if(result == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}