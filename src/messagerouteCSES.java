import java.util.*;
import java.io.*;
public class messagerouteCSES {

	static List<Integer>[] adj;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		adj = new ArrayList[n+1];
		
		for(int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			
			int a = Integer.parseInt(f1.nextToken());
			int b = Integer.parseInt(f1.nextToken());
			
			adj[a].add(b);
			adj[b].add(a);
	
		}
		int[] parent = new int[n+1];
		boolean[] visited = new boolean[n+1];
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(1);
		List<Integer> l = new ArrayList<>();
		while(!dq.isEmpty()) {
			int c = dq.remove();
			if(c==n) {
				int cur = c;
				while(cur!=1) {
					l.add(cur);
					cur = parent[cur];
				}
				l.add(1);
				break;
			}
			for(int v: adj[c]) {
				if(!visited[v]) {
					parent[v] = c;
					dq.add(v);
					visited[v] = true;
				}
				
			}
		}
		if(l.size()==0) System.out.println("IMPOSSIBLE");
		else {
			StringBuilder s = new StringBuilder();
			System.out.println(l.size());
			for(int i = l.size()-1; i >= 0; i--) {
				s.append(l.get(i) + " ");
			}
			System.out.println(s);
			
		}
		
	}

}
