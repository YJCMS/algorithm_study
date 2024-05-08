import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        sb.append(A*(B%10)).append('\n');
        sb.append(A*((B%100)/10)).append('\n');
        sb.append(A*(B/100)).append('\n');
        sb.append(A*B).append('\n');

        System.out.print(sb);
    }
}