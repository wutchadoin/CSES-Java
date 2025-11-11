import java.util.*;
import java.io.*;
public class appledivisionCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int[] a = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(f.nextToken());
			sum+=a[i];
		}
		long min = Long.MAX_VALUE;
		
		for(int i = 0; i < (1<<(n)); i++) {
			long s = 0;
			for(int bit = 0; bit < n; bit++) {
				if((i&(1<<bit))==(1<<bit)) s+=a[n-bit-1];
			}
			
			min = Math.min(min, Math.abs(sum-2*s));
			
		}
		System.out.println(min);
	}

}
