import java.util.*;
import java.io.*;
public class advertisementCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		long[] a = new long[n];
		for(int i = 0 ; i < n; i++) a[i] = Integer.parseInt(f.nextToken());
		
		Stack<Integer> s = new Stack<>();
		
		long arr = 0;
		for(int i = 0; i < n; i++) {
			
			while(!s.isEmpty() && a[s.peek()] >= a[i]) s.pop();
			
			if(s.isEmpty()) {
				arr = Math.max(arr, (i+1)*a[i]);
			}else {
				arr = Math.max(arr, a[i]*(i-s.peek()));
			}
			System.out.println(arr + " " + a[i]);
			
			s.push(i);
			
		}
		System.out.println(arr);
		
	}

}
