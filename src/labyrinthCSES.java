import java.util.*;
import java.io.*;
public class labyrinthCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		char[][] a = new char[n][m];
		boolean[][] visited = new boolean[n][m];
		
		int r = 0;
		int c = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = in.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(a[i][j] == 'A') {
					r = i;
					c = j;
				}
			}
		}
		
		boolean b = false;
		Queue<P> q = new LinkedList<>();
		q.offer(new P(r,c,'F', null));
		
		StringBuilder s = new StringBuilder();
		
		while(!q.isEmpty()) {
			P cur = q.poll();
			int cr = cur.r;
			int cc = cur.c;
			
			if(cr < 0 || cc < 0 || cr >= n || cc >= m || visited[cr][cc] || a[cr][cc] == '#') continue;
			//System.out.println(cr + " " + cr);
			if(a[cr][cc] == 'B') {
				while(cur.dir != 'F') {
					//System.out.println(cur.dir);
					s.append(cur.dir);
					cur = cur.prev;
				}
				b = true;
				break;
			}
			
			visited[cr][cc] = true;
			q.offer(new P(cr - 1, cc, 'U', cur));
			q.offer(new P(cr + 1, cc, 'D', cur));
			q.offer(new P(cr, cc-1, 'L', cur));
			q.offer(new P(cr, cc+1, 'R', cur));
			
		}
		
		if(!b) System.out.println("NO");
		else {
			System.out.println("YES");
			System.out.println(s.length());
			System.out.println(s.reverse());
		}
		
		
		
	}
	static class P{
		int r, c;
		P prev;
		char dir;
		P(int r, int c, char dir, P prev){
			this.r=r;
			this.c=c;
			this.dir = dir;
			this.prev = prev;
		}
	}
}
