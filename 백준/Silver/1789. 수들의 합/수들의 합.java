import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
		long s = Long.parseLong(br.readLine());
		long n = 1;
		long sum = 0;
		while(true) {
			sum += n;
			if(sum>s) break;
			n++;
		}
		System.out.println(n-1);
		
	}
}