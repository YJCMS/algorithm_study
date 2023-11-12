import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String s = in.next();
       int result = 0;

       for(int i = 0; i < s.length(); i++) {
           char a = s.charAt(i);
           if(a >= 65 && a < 68) {
               result = result + 3;
           } else if(a >= 68 && a < 71) {
               result = result + 4;
           } else if(a >= 71 && a < 74) {
               result = result + 5;
           } else if(a >= 74 && a < 77) {
               result = result + 6;
           } else if(a >= 77 && a < 80){
               result = result + 7;
           } else if(a >= 80 && a < 84) {
               result = result + 8;
           } else if(a >= 84 && a < 87) {
               result = result + 9;
           } else if(a >= 87 && a < 91) {
               result = result + 10;
           } else {
               result = result + 11;
           }
       }

        System.out.println(result);
    }
}
