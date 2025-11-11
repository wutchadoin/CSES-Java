import java.util.*;
import java.io.*;
public class rectanglecuttingCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		long[][] ab = new long[n+1][m+1];
		for(int i = 0; i <= n; i++) Arrays.fill(ab[i],Integer.MAX_VALUE);
		//ab[1][1] = 1;
		//for(int i = 0; i <= Math.min(n, m); i++) ab[i][i]=1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i==j) {
					ab[i][j] = 0;
					continue;
				}
				for(int k = i-1; k>=1; k--) {
					ab[i][j] = Math.min(ab[i][j], 1+ab[k][j]+ab[i-k][j]);
				}
				for(int k = j-1; k>=1; k--) {
					ab[i][j] = Math.min(ab[i][j], 1+ab[i][k]+ab[i][j-k]);
				}
			}
		}
		System.out.println(ab[n][m]);
		
		
		
	}

}
