import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = "";
        for(int i = 0; i < n; i++) {
            result += "*";
            System.out.println(result);
        }
        in.close();
    }
}
