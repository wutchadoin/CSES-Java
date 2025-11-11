import java.util.*;
import java.io.*;
public class roadconstructionCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		DSU dsu = new DSU(n);
		
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			
			int a = Integer.parseInt(f1.nextToken())-1;
			int b = Integer.parseInt(f1.nextToken())-1;
			
			dsu.merge(a, b);
			System.out.println(dsu.count + " " + dsu.max);
		}
		
	}

	static class DSU{
		int[] parents;
		int[] size;
		int count;
		int max;
		
		DSU(int s){
			parents = new int[s];
			size = new int[s];
			count = s;
			max = 1;
			for(int i = 0; i < s;i++) {
				parents[i] = i;
				size[i] = 1;
			}
		}
		
		int find(int x) {
			if(parents[x]==x) return x;
			return find(parents[x]);
		}
		
		boolean merge(int x, int y) {
			int rx = find(x);
			int ry = find(y);
			
			if(rx==ry) return false;
			
			if(rx < ry) return merge(y,x);
			parents[ry] = rx;
			size[rx] += size[ry];
			max = Math.max(size[rx], max);
			count--;
			return true;
			
		}
		
		
	}
			
}
