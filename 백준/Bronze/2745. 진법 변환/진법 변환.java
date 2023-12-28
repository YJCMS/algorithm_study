import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        int b = in.nextInt();
        int result = 0;
        int index = 0;
        int num = 0;

        for(int i = n.length()-1; i >= 0; i--) {
            char c = n.charAt(i);
            if(c >= '0' && c<='9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            result += num * Math.pow(b, index++);
        }
        System.out.println(result);
    }
}