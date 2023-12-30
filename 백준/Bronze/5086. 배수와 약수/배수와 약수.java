import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        String a = "factor\n";
        String b = "multiple\n";
        String c = "neither\n";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            if (m % n== 0) {
                sb.append(a);
            } else if (n % m == 0) {
                sb.append(b);
            } else sb.append(c);
        }
            System.out.println(sb);
    }
}