import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;


        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        // 산술평균 : N개의 수들의 합을 N으로 나눈 값
        sb.append(Math.round(sum/n)).append('\n');

        // 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        sb.append(arr[n/2]).append('\n');

        // 최빈값 : N개의 수들 중 가장 많이 나타나는 값
        int count = 0;
        int max = -1;

        int mod = arr[0];
        boolean check = false;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            } else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            } else if (max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }

        sb.append(mod).append('\n');

        // 범위 : N개의 수들 중 최댓값과 최솟값의 차이
        sb.append(arr[n-1]-arr[0]).append('\n');

        System.out.println(sb);

    }
}