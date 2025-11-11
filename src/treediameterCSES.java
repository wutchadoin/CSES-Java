import java.util.*;
import java.io.*;
/*
I should really lookup the actual tree diameter algorithm

 */

public class treediameterCSES {
	static List<Integer>[] a;
	static boolean[] visited;
	static int max;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		a = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i <= n; i++) a[i] = new ArrayList<>();
		
		for(int i = 0; i < n-1 ;i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			int one = Integer.parseInt(f.nextToken());
			int two = Integer.parseInt(f.nextToken());
			a[one].add(two);
			a[two].add(one);
		}
		
		int d = dfs(1);
		
		System.out.println(max);
		
		
	}
	
	public static int dfs(int cur) {
		if(visited[cur] || a[cur].size()==1 && visited[a[cur].get(0)]) return 1;
		visited[cur] = true;
		int max1 = 0;
		int max2 = 0;
		for(int v: a[cur]) {
			int d = dfs(v);
			if(d > max1) {
				max2 = max1;
				max1 = d;
			}else if(d > max2) max2 = d;
		}
		max = Math.max(max1+max2, max);
		return max1+1;
		
	}

}
