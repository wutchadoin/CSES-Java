import java.util.*;
import java.io.*;

public class treematchingCSES {
	
	static List<Integer>[] tree;
	static boolean[] taken;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		tree = new ArrayList[n];
		taken = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n-1; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			int boss = Integer.parseInt(f.nextToken());
			int cus = Integer.parseInt(f.nextToken());
			
			tree[boss-1].add(cus-1);
			tree[cus-1].add(boss-1);
		}

		System.out.println(dfs(0,0));
		
	}
	
	public static int dfs(int cur, int prev) {
		if(taken[cur]) return 0;
		
		int count = 0;
		
		if(taken[cur] == false&&taken[prev] == false) {
			taken[cur] = true;
			taken[prev] = true;
			count += 1;
		}
		
		for(int i = 0; i < tree[cur].size(); i++) {
			count += dfs(tree[cur].get(i),cur);
		}
		
		return count;
		
		
		
	}

}
