import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String a = "";
        String b = "";

        for(int i = 2; i >= 0; i-- ) {
            a = a + s.charAt(i);
            b = b + s.charAt(i+4);
        }

        int result1 = Integer.parseInt(a);
        int result2 = Integer.parseInt(b);

        if (result1 < result2) {
            System.out.println(result2);
        } else {
            System.out.println(result1);
        }
    }
}