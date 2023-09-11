import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] arr = new int[n];
        String result = "";
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] < x) result += arr[i] + " ";
        }
        result = result.trim();
        System.out.print(result);
    }
}