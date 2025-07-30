import java.util.*;
import java.io.*;

public class weirdalgoCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
		
		while(n!=1) {
			System.out.print(n + " ");
			if(n%2 == 0) n /= 2;
			else n = (n * 3) + 1;
		}
		System.out.print(1);
		
	}

}
