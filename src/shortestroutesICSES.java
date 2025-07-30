import java.util.*;
import java.io.*;
public class shortestroutesICSES {
	static List<P>[] arr;
	static boolean[] visited;
	static long[] time;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		arr = new ArrayList[n+1];
		time = new long[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i <= n; i++) arr[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(f1.nextToken());
			int b = Integer.parseInt(f1.nextToken());
			long c = Long.parseLong(f1.nextToken());
			
			arr[a].add(new P(b,c));
		}
		
		PriorityQueue<P> pq = new PriorityQueue<>();
		
		pq.add(new P(1,0));
		
		while(!pq.isEmpty()) {
			P cur = pq.poll();
			if(visited[cur.to]) continue;
			visited[cur.to] = true;
			time[cur.to] = cur.time;
			long t = cur.time;
			
			for(P c : arr[cur.to]) {
				pq.offer(new P(c.to,c.time+t));
			}
		}
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= n; i ++) {
			s.append(time[i] + " ");
		}
		System.out.println(s.toString().trim());
		
	}
	
	static class P implements Comparable<P>{
		int to;
		long time;
		P(int to, long time){
			this.to=to;
			this.time=time;
		}
		@Override
		public int compareTo(P o) {
			return Long.compare(this.time, o.time);
		}
		
		
	}

}
