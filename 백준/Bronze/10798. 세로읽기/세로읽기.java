import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] arr = new char[5][15];

        for(int i = 0; i < arr.length; i++) {
            String s = in.nextLine();
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0')
                    continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}