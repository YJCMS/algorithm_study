import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        String str = "";

        for(int j = 0; j < i; j++){
            str = in.next();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
        }
    }
}