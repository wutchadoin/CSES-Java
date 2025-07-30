import java.util.*;
import java.io.*;
public class buildingteamsCSES {
 
	static List<Integer>[] a;
	static boolean[] visited;
	static int[] label;
	static boolean b = false;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		a = new ArrayList[n+1];
		visited = new boolean[n+1];
		label = new int[n+1];
		
		for(int i = 1; i <= n; i++) a[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			
			int x = Integer.parseInt(f1.nextToken());
			int y = Integer.parseInt(f1.nextToken());
			a[x].add(y);
			a[y].add(x);
		}
		
		StringBuilder s = new StringBuilder();
		
		for(int i = 1; i <= n;i ++) {
			dfs(i,1, 0);
			
			s.append(label[i] + " ");
			
		}
		
		System.out.println(b ? "IMPOSSIBLE" : s);
		
		
	}
 
	public static void dfs(int cur, int l, int prev) {
		if(b) return;
		if(visited[cur]) {
			if(label[prev] == label[cur]) b = true;
			return;
		}
		visited[cur] = true;
		label[cur] = l;
		for(int i: a[cur]) {
			if(l==1) dfs(i,2, cur);
			else dfs(i,1, cur);
		}
		
	}
}