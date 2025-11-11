import java.io.*;
import java.util.*;
public class bitstringsCSES {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int c = 1;
		int mod = (int)1E9+7;
		for(int i = 0; i < n; i++) {
			c*=2;
			c%=mod;
		}
		System.out.println(c);

	}

}
