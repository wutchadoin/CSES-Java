import java.util.*;
import java.io.*;

public class permutationsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		if(n==1) System.out.println("1");
		else if(n == 4) System.out.println("2 4 1 3");
		else if(n<4) System.out.println("NO SOLUTION");
		else {
			StringBuilder e = new StringBuilder();
			for(int i = 1; i <= n; i+=2) {
				e.append(i);
				e.append(' ');
			}
			for(int i = 2; i <= n; i+=2) { 
				e.append(i);
				e.append(' ');
			}
			System.out.println(e);
		}
		
		

	}

}
