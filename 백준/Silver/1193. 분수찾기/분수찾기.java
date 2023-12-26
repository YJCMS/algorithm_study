import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int count_sum = 0;

        while(true) {
            if(n <= count_sum + count) {
                if(count%2 == 1) {
                    System.out.println((count - (n -count_sum - 1)) + "/" + (n - count_sum));
                    break;
                } else {
                    System.out.println((n - count_sum) + "/" + (count - (n - count_sum - 1)));
                    break;
                }
            } else {
                count_sum += count;
                count++;
            }
        }
    }
}