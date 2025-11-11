import java.util.*;
import java.io.*;
public class buildingroadsCSES {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		List<Integer>[] adj = new ArrayList[Integer.parseInt(f.nextToken())+1];
		List<Integer> ret = new ArrayList<>();
		

		boolean[] visited = new boolean[adj.length];
		
		
		int num = Integer.parseInt(f.nextToken());
		for(int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}
		for(int i = 1; i <= num; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int fir = Integer.parseInt(f1.nextToken());
			int sec = Integer.parseInt(f1.nextToken());
			adj[fir].add(sec);
			adj[sec].add(fir);
		}
		int numm = count(adj, visited, ret);
		System.out.println(numm-1);
		
		for(int i = 1; i < numm; i++) {
			System.out.println(ret.get(0) + " " + ret.get(i));
		}

	}
	
	public static void dfs(int node, boolean[] visited, List<Integer>[] adj) {
		visited[node] = true;
		for(int val: adj[node]) {
			if(!visited[val]) dfs(val, visited, adj);
		}
	}
	
	public static int count(List<Integer>[] adj, boolean[] visited, List<Integer> ret) {
		int count = 0;
		for(int i = 1; i < adj.length; i++) {
			if(visited[i]) continue;
			count++;
			ret.add(i);
			dfs(i, visited, adj);
		}
		return count;
	}

}
