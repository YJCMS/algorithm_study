import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int result = 0;
        int v = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == v) result++;
        }
        
        System.out.println(result);
    }
}