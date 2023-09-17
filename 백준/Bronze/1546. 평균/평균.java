import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        double max = 0;
        double result = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            if(arr[i] > max) max = arr[i];
        }

        for(int j = 0; j < n; j++) {
            result += arr[j]/max*100;
        }

        System.out.println(result/n);
    }
}