import java.util.*;
import java.io.*;

public class arraydivisionCSES {

	public static long[] arr;
	public static int n,k;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(f.nextToken());
		k = Integer.parseInt(f.nextToken());
		
		arr = new long[n+1];
		
		long lo = 0;
		long hi = n;
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(f1.nextToken()) + arr[i-1];
		}
		
		while(lo<hi) {
			long mid = lo + (hi-lo+1)/2;
			System.out.println(mid + " " + check(mid));
			if(check(mid)) {
				lo = mid;
			}else {
				hi = mid-1;
			}
		}
		System.out.println(lo);
		
		
	}
	
	public static boolean check(long max) {
		
		long sum = arr[0];
		int arrs = 1;
		boolean filled = false;
		for(int i = 1; i < n ; i++) {
			if(sum + arr[i] > max) {
				arrs++;
				if(arrs > k) return false;
				sum = arr[i];
			}else {
				sum+=arr[i];
				if(sum == max) filled = true;
			}
		}
		if(arrs != k) return false;
		return filled;
	}

}
