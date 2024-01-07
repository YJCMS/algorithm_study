import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for(int i = 0; i < n; i++) {
            arrX[i] = in.nextInt();
            arrY[i] = in.nextInt();
        }

        int maxX = Arrays.stream(arrX).max().getAsInt();
        int maxY = Arrays.stream(arrY).max().getAsInt();
        int minX = Arrays.stream(arrX).min().getAsInt();
        int minY = Arrays.stream(arrY).min().getAsInt();

        System.out.println((maxX-minX) * (maxY-minY));
    }
}