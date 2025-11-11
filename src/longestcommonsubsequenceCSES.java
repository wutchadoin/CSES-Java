import java.util.*;
import java.io.*;
public class longestcommonsubsequenceCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		StringTokenizer f2 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		int[] a = new int[n];
		int[] b = new int[m];
		
		int[][] ab = new int[n+1][m+1];
		for(int i = 0; i < n; i++) a[i] = Integer.parseInt(f1.nextToken());
		for(int i = 0; i < m; i++) b[i] = Integer.parseInt(f2.nextToken());
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				
				if(a[i-1] == b[j-1]) {
					ab[i][j] = 1 + ab[i-1][j-1];
				}else {
					if(ab[i-1][j] > ab[i][j-1]) {
						ab[i][j] = ab[i-1][j];
					}else {
						ab[i][j] = ab[i][j-1];
					}
				}
			}
		}
		
		System.out.println(ab[n][m]);
		List<Integer> l = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		while(n > 0 && m > 0) {
			if(a[n-1] == b[m-1]) {
				l.add(a[n-1]);
				n--;
				m--;
			}else if(ab[n-1][m] > ab[n][m-1]) {
				n--;
			}else {
				m--;
			}
		}
		Collections.reverse(l);
		for(int i : l) s.append(i + " ");
		System.out.println(s.toString().trim());
		
	}

}
