import java.util.*;
import java.io.*;
public class longestflightrouteCSES {
	static ArrayList<Integer>[] a;
	static int[] ind;
	static long[] sum;
	static int[] parent;
	static int n;
	static StringBuilder ret;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		a = new ArrayList[n+1];
		ind = new int[n+1];
		sum = new long[n+1];
		parent = new int[n+1];
		
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
		System.out.println(sum[n]>0?sum[n]:"IMPOSSIBLE");
		if(sum[n]>0) {
			int num = n;
			ret = new StringBuilder();
			pr(n);
			System.out.println(ret.toString().trim());
		}
		
	}
	static void pr(int cur) {
		
		if(cur==1) {
			ret.append(cur);
			ret.append(" ");
			return;
		}
		pr(parent[cur]);
		ret.append(cur);
		ret.append(" ");
		
	}
	static void fill(int cur) {
		for(int i : a[cur]) {
			ind[i]++;
			if(ind[i]==1) fill(i);
		}
	}
	static void count(int cur) {
		for(int i : a[cur]) {
			if(sum[cur]+1 > sum[i]) {
				parent[i]=cur;
				sum[i] = sum[cur]+1;
			}
			ind[i]--;
			if(i==n) continue;
			if(ind[i]==0) count(i);
		}
	}

}
