import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') cnt++;

        }

        if(s.charAt(0) != ' ' && s.charAt(s.length()-1) != ' ') cnt++;
        if(s.charAt(0) == ' ' && s.charAt(s.length()-1) == ' ') cnt--;

        System.out.println(cnt);
    }
}