import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        Integer[] arr = new Integer[n.length()];

        for(int i = 0; i < n.length(); i++) {
            arr[i] = n.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int value : arr) {
            System.out.print(value);
        }
    }
}