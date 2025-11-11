import java.util.*;
import java.io.*;
public class coursescheduleCSES {
	static List<Integer>[] a;
	static int[] ind;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		a = new ArrayList[n+1];
		ind = new int[n+1];
		for(int i = 1; i <= n; i++) a[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int from = Integer.parseInt(f1.nextToken());
			int to = Integer.parseInt(f1.nextToken());
			a[from].add(to);
			ind[to]++;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 1; i <= n; i++) if(ind[i] == 0) pq.offer(i);
		int count = 0;
		//boolean[] visited = new boolean[n+1];
		StringBuilder s = new StringBuilder();
		while(!pq.isEmpty()) {
			int cur = pq.poll();
			count++;
			s.append(cur + " ");
			for(int i: a[cur]) {
				ind[i]--;
				if(ind[i] == 0) pq.offer(i);
			}
		}
		if(count == n) System.out.println(s.toString().trim());
		else System.out.println("IMPOSSIBLE");

	}

}
