import java.util.*;
import java.io.*;
public class distinctvaluessubarraysCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int[] a = new int[n];
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0; i < n ;i++) a[i] = Integer.parseInt(f.nextToken());
		
		int lo = 0;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			while(lo < i && s.contains(a[i])) {
				s.remove(a[lo]);
				lo++;
			}
			
			sum += (i-lo+1);
			s.add(a[i]);
			
		}
		System.out.println(sum);
		
	}

}
