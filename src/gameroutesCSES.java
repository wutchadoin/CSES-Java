import java.util.*;
import java.io.*;
public class gameroutesCSES {
	static ArrayList<Integer>[] a;
	static long mod = (long)1e9+7;
	static int[] ind;
	static long[] sum;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		a = new ArrayList[n+1];
		ind = new int[n+1];
		sum = new long[n+1];
		
		for(int i = 1; i <= n; i++) a[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int b = Integer.parseInt(f1.nextToken());
			int c = Integer.parseInt(f1.nextToken());
			a[b].add(c);
		}
		
		fill(1);
		sum[1]=1;
		count(1);
		System.out.println(sum[n]);
		
	}
	static void fill(int cur) {
		for(int i : a[cur]) {
			ind[i]++;
			if(ind[i]==1) fill(i);
		}
	}
	static void count(int cur) {
		for(int i : a[cur]) {
			sum[i]+=sum[cur];
			sum[i]%=mod;
			ind[i]--;
			if(i==n) continue;
			if(ind[i]==0) count(i);
		}
	}

}
