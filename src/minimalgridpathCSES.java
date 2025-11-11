import java.util.*;
import java.io.*;
public class minimalgridpathCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		char[][] c = new char[n][n];
		int[][] prev = new int[n][n];
		for(int i = 0; i < n; i++) {
			c[i] = in.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i > 0 && j > 0) {
					if(c[i-1][j] < c[i][j-1]) prev[i][j] = -1;
					else prev[i][j] = -2;
				}else if(i > 0) {
					prev[i][j] = -2;
				}else {
					prev[i][j] = -1;
				}
			}
		}
		StringBuilder s = new StringBuilder();
		int m = n;
		while(n >= 0 && m >= 0) {
			s.append(c[n][m]);
			if(prev[n][m] == -1) {
				
			}else {
				
			}
			if(n==0 || m == 0) break;
		}
		
		
		
	}

}
