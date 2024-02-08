import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        boolean[] result = new boolean[n+1];

        for(int i = 2; i <= n; i++) {
            if(result[i]) continue;

            if(i >= m) sb.append(i).append('\n');

            for(int j = i + i; j <= n; j += i) {
                result[j] = true;
            }
        }

        System.out.println(sb);
    }
}