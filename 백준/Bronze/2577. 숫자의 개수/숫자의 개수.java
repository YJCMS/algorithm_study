import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();
                int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

                int[] arr = new int[10];

                String str = String.valueOf(n);

                for(int i = 0; i < str.length(); i++) {
                        arr[str.charAt(i) - 48]++;
                }

                for(int value : arr) {
                        sb.append(value).append('\n');
                }

                System.out.println(sb);
        }
}