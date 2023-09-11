import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        int idx = 0;

        for (int i=0; i< 9; i++) {
            arrayList.add(in.nextInt());
            if(arrayList.get(i) > max) {
                max = arrayList.get(i);
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}