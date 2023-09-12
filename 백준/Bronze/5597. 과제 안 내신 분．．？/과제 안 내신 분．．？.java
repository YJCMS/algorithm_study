import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];
        
        for(int i = 0; i < 28; i++) {
            int j = in.nextInt();
            arr[j-1] = j;
        }
        for(int k = 0; k < 30; k++) {
            if(arr[k] == 0) System.out.println(k+1);
        }
    }
}