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
		
		arr = new long[n];
		
		long lo = 0;
		long hi = (long)1E15;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(f1.nextToken());
		}
		
		while(lo<hi) {
			long mid = lo + (hi-lo)/2;
			//System.out.println(mid + " " + check(mid));
			int groups = check(mid);
			if(groups <= k) {
				hi = mid;
			}else lo = mid+1;
		}
		System.out.println(lo);
		
		
	}
	
	public static int check(long max) {
		int c = 1;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) return 100000000;
			if(arr[i]+sum > max) {
				sum = arr[i];
				c++;
			}else {
				sum+=arr[i];
			}
		}
		return c;
	}
}

