import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<String>();;

        int result = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                result += set.size();
                set.clear();
            } else {
                set.add(s);
            }
        }

        result += set.size();

        System.out.println(result);
    }
}