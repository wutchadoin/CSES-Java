import java.util.*;
import java.io.*;
public class coincombinationsIICSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int x = Integer.parseInt(f.nextToken());
		long mod = (long)1e9+7;
		long[] sum = new long[x+1];
		sum[0] = 1;
		for(int i = 0; i < n; i++) {
			int coin = Integer.parseInt(f1.nextToken());
			for(int j = coin; j < sum.length; j++) {
				sum[j] = (sum[j] + sum[j-coin])%mod;
			}
		}
		System.out.println(sum[x]);
		
	}

}
