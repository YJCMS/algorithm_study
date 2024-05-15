import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        String str = "";
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < i; j++){
            str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append('\n');
        }
        System.out.println(sb);
    }
}