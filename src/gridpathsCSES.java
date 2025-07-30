import java.util.*;
import java.io.*;
public class gridpathsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(in.readLine());
		
		char[][] c = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			c[i] = in.readLine().toCharArray();
		}
		int mod = (int)1E9 + 7;
		int[][] a = new int[n][n];
		if(c[0][0] != '*') a[0][0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(c[i][j] == '*') continue;
				if(i > 0 && c[i-1][j] != '*') a[i][j] += a[i-1][j];
				a[i][j]%=mod;
				if(j > 0 && c[i][j-1] != '*') a[i][j] += a[i][j-1];
				a[i][j]%=mod;
			}
		}
		
		System.out.println(a[n-1][n-1]);
	
	}

}
