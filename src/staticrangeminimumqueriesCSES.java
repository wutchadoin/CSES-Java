import java.util.*;
import java.io.*;
public class staticrangeminimumqueriesCSES{
	static int[][] rmq;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int q = Integer.parseInt(f.nextToken());
		int[] a = new int[n];
		
		int max = 0;
		while((1 << (max)) < n) max++;
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(f1.nextToken());
			
		}
		
		rmq = new int[n][max+1]; //column by log
		for(int i = 0; i < n; i++) {
			rmq[i][0] = a[i];
		}
		
		for(int  j = 1; j <= max; j++) {
			for(int i = 0; i + (1<<(j)) <= n; i++) {
				rmq[i][j] = Math.min(rmq[i][j-1],rmq[i+(1<<(j-1))][j-1]);
			}
		}
		
		while(q-->0) {
			StringTokenizer f2 = new StringTokenizer(in.readLine());
			int x1 = Integer.parseInt(f2.nextToken())-1;
			int x2 = Integer.parseInt(f2.nextToken())-1;
			
			out.println(query(rmq,Math.min(x1, x2),Math.max(x1, x2)));
			
		}
		out.close();
	}
	
	static int query(int[][] rmq, int l, int r) {
		int val = 0;
		while(1<<(val+1) <= r-l+1) val++;
		return Math.min(rmq[l][val],rmq[r-(1<<val)+1][val]);
	}
	
}