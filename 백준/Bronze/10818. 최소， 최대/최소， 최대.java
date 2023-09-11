import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = -1000001, min = 1000001;
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.print(min + " " + max);
    }
}