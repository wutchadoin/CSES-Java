import java.io.*;
import java.util.*;

public class minimizingcoinsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int x = Integer.parseInt(f.nextToken());
		
		int[] coins = new int[n];
		int[] c = new int[x+1];
		
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(f1.nextToken());
			if(coins[i] < x+1) c[coins[i]]++;
		}
		
		for(int i = 1; i <= x; i++) {
			if(c[i] > 0) continue;
			int min = Integer.MAX_VALUE;
			for(int v: coins) {
				if(v <= i && c[i-v] > 0) min = Math.min(c[i-v],min);
			}
			//System.out.println(min);
			c[i] = min + 1;
		}
		//for(int i = 0; i < x; i++) System.out.println(c[i]);
		if(c[x] == Integer.MIN_VALUE) System.out.println(-1);
		else System.out.println(c[x]);
		
		
		
	}

}
