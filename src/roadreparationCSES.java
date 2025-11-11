import java.util.*;
import java.io.*;

public class roadreparationCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		DSU dsu = new DSU(n);
		long[][] edge = new long[m][3];
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			long a = Long.parseLong(f1.nextToken())-1;
			long b = Long.parseLong(f1.nextToken())-1;
			long c = Long.parseLong(f1.nextToken());
			edge[i] = new long[]{a,b,c};
		}
		Arrays.sort(edge, (a,b) -> Long.compare(a[2], b[2]));
		long min = Long.MAX_VALUE;
		for(int i = 0; i < m; i++) {
			dsu.merge((int)edge[i][0], (int)edge[i][1], edge[i][2]);
			if(dsu.size[dsu.find((int)edge[i][0])] == n) {
				min = Math.min(min, dsu.cost[dsu.find((int)edge[i][0])]);
			}
		}
		if(min==Long.MAX_VALUE) System.out.println("IMPOSSIBLE");
		else System.out.println(min);
		
	}

	static class DSU{
		int[] parents, size;
		long[] cost;
		DSU(int s){
			parents = new int[s];
			size = new int[s];
			cost = new long[s];
			for(int i=0;i<s;i++) {
				parents[i]=i;
				size[i]=1;
			}
		}
		int find(int x) {
			if(parents[x]==x)return x;
			int root = find(parents[x]);
			parents[x]=root;
			return root;
		}
		boolean merge(int x,int y, long c) {
			int rx = find(x);
			int ry = find(y);
			
			if(rx==ry) return false;
			if(size[rx]<size[ry]) return merge(ry,rx,c);
			parents[ry]=rx;
			size[rx]+=size[ry];
			cost[rx]+=cost[ry]+c;
			return true;
		}
		boolean connected(int x, int y) {
			return find(x)==find(y);
		}
	}
}
