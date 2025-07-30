import java.util.*;
import java.io.*;
public class apartmentsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		StringTokenizer f2 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		int k = Integer.parseInt(f.nextToken());
		
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0; i < n; i++) a[i] = Integer.parseInt(f1.nextToken());
		for(int i = 0; i < m; i++) b[i] = Integer.parseInt(f2.nextToken());
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int apt = 0;
		int c = 0;
		for(int i = 0; i < n; i++) {
			while(apt < m && b[apt] < a[i] - k) apt++;
			
			if(apt == m) break;
			
			if(b[apt] <= a[i]+k) {
				c++;
				apt++;
			}
			
		}
		
		System.out.println(c);
	
	}

}
