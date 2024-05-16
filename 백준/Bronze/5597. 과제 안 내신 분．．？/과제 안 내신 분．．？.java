import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[30];

        for(int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a-1] = 1;
        }

       for(int i = 0; i < 30; i++) {
           if(arr[i] == 0) {
               sb.append(i+1).append('\n');
           }
       }

        System.out.println(sb);
    }
}