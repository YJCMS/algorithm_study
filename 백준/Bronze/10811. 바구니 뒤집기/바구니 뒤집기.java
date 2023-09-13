import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < m; i++) {
            int I = in.nextInt()-1;
            int J = in.nextInt()-1;

            for(int j = I; j <= (I+J)/2; j++) {
                int tmp = arr[j];
                arr[j] = arr[J+I-j];
                arr[J+I-j] = tmp;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}