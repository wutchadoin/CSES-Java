import java.util.*;
import java.io.*;
public class editdistanceCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine();
		String s2 = in.readLine();
		
		int[][] a = new int[s1.length()][s2.length()];
		
		for(int i = 0; i < s1.length(); i++) {
			char m = s1.charAt(i);
			for(int j = 0; j < s2.length(); j++) {
				char n = s2.charAt(j);
				
				if(m==n) {
					a[i][j]++;
					if(i > 0 && j > 0) a[i][j] += a[i-1][j-1];
				}else {
					int v = 0;
					if(i>0) {
						v = Math.max(a[i-1][j], v);
					}
					if(j > 0) {
						v = Math.max(a[i][j-1], v);
					}
					a[i][j] = v;
				}
				
			}
		}
		
		
	}

}
