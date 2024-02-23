import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;

        if(n > 0) {
            for(int i = n-1; i > 0; i--) {
                result *= i;
            }
            System.out.println(result);
        } else {
            System.out.println(1);
        }
    }
}