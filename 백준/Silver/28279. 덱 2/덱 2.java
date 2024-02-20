import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1" : deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case "2" : deque.addLast(Integer.parseInt(st.nextToken())); break;
                case "3" : sb.append(!deque.isEmpty() ? deque.removeFirst() : -1).append("\n"); break;
                case "4" : sb.append(!deque.isEmpty() ? deque.removeLast() : -1).append("\n"); break;
                case "5" : sb.append(deque.size()).append("\n"); break;
                case "6" : sb.append(deque.isEmpty() ? 1 : 0).append("\n"); break;
                case "7" : sb.append(!deque.isEmpty() ? deque.getFirst() : -1).append("\n"); break;
                case "8" : sb.append(!deque.isEmpty() ? deque.getLast() : -1).append("\n"); break;
            }
        }

        System.out.println(sb.toString());
    }
}