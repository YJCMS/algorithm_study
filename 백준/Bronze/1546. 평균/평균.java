import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[n];
        double max = 0;
        double result = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i] > max) max = arr[i];
        }

        for(int j = 0; j < n; j++) {
            result += arr[j]/max*100;
        }

        System.out.println(result/n);
    }
}