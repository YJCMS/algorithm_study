import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        Scanner in = new Scanner(System.in);
        int max = 0;
        int n = 0;
        int m = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int a = in.nextInt();
                arr[i][j] = a;
                if(a > max) {
                    n = i;
                    m = j;
                    max = a;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d",n+1, m+1);
    }
}