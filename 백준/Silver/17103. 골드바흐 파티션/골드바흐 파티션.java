import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for(int i = 2; i * i <= 1000000; i++) {
            if(!num[i]) {
                for(int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }

        while(n --> 0) {
            int temp = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j = 2; j <= temp / 2; j++) {
                if(!num[j] && !num[temp - j]) result++;
            }
            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}