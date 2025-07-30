import java.util.*;
import java.io.*;
public class treediameterCSES {

	public static List<Integer>[] tree;
	public static boolean[] visited;
	public static int max;
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		tree = new ArrayList[n+1];
		visited = new boolean[n+1];
		max = 0;
		
		for(int i = 0; i < n-1; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			int fir = Integer.parseInt(f.nextToken());
			int sec = Integer.parseInt(f.nextToken());
			
			
			tree[fir].add(sec);
			tree[sec].add(fir);
			
		}
		
		dfs(1);
		
		
	}

	public static void dfs(int num) {
		
		if(tree[num].isEmpty()) return;
		
		
		
		
	}
	
}
