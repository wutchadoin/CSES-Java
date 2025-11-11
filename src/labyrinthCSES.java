import java.util.*;
import java.io.*;
public class labyrinthCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		char[][] grid = new char[n][m];
		int[][] min = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		PriorityQueue<A> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			grid[i] = in.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(grid[i][j] == 'a') {
					pq.add(new A(i,j,0));
				}
			}
		}
		
		
		while(!pq.isEmpty()) {
			A cur = pq.remove();
			int r = cur.r;
			int c = cur.c;
			if(grid[r][c] == '#' || visited[r][c]) continue;
			if(grid[r][c] == 'B') {
				
				
			}else {
				if(min[r][c] == 0 || min[r][c] > cur.dist) {
					
				}
			}
			
		}
		//dijkstras
		
		
	}
	
	static class A implements Comparable<A>{
		int r, c, dist;
		A parent;
		A(int r,int c, int dist){
			this.r = r;
			this.c = c;
		}
		@Override
		public int compareTo(labyrinthCSES.A o) {
			return this.dist-o.dist;
		}
		
		
	}
	
}
