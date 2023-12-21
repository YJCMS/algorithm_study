import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            int[] coin = new int[4];
            int money = in.nextInt();
            coin[0] = money/25;
            coin[1] = (money%25)/10;
            coin[2] = (money%25%10)/5;
            coin[3] = (money%25%10%5)/1;
            System.out.print(coin[0] + " ");
            System.out.print(coin[1] + " ");
            System.out.print(coin[2] + " ");
            System.out.println(coin[3]);
        }
    }
}