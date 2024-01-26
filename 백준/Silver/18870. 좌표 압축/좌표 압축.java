import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < n; i++) {
            sortedArr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        int rank = 0;
        for(int v : sortedArr) {
            if(!rankMap.containsKey(v)){
                rankMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int key : arr) {
            sb.append(rankMap.get(key)).append(" ");
        }

        System.out.println(sb);
    }
}
