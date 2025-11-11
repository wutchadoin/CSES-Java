import java.util.*;
import java.io.*;
public class sumofthreevaluesCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		long time = System.currentTimeMillis();
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		long x = Integer.parseInt(f.nextToken());
		
		long[] arr = new long[n];
		boolean b = false;
		for(int i = 0; i < n; i++) arr[i] = Long.parseLong(f1.nextToken());
		for(int i = 0; i < n-2; i++) {
			Map<Long,Integer> m = new HashMap<>();
			
			for(int j = i+1; j < n; j++) {
				if(m.containsKey(x-arr[i]-arr[j])) {
					System.out.println((i+1) + " " + (j+1) + " " + (m.get(x-arr[i]-arr[j])+1));
					b = true;
					break;
				}
				m.put(arr[j], j);
			}
			if(b) break;
		}
		if(!b) System.out.println("IMPOSSIBLE");
		//System.out.println(System.currentTimeMillis()-time);
	}

}
