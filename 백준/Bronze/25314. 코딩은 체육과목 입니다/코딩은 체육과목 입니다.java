import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()/4;
        String result = "";

        for(int i = 0; i < n; i++) {
            result += "long ";
        }

        result += "int";

        System.out.println(result);

    }
}