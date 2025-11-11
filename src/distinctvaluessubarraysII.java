import java.util.*;
import java.io.*;
public class distinctvaluessubarraysII {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int k = Integer.parseInt(f.nextToken());
		Map<Integer,Integer> m = new HashMap<>();
		long sum = 0;
		int lo = 0;
		int[] a = new int[n];
		int tot = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(f1.nextToken());
			m.put(a[i],m.getOrDefault(a[i], 0)+1);
			tot++;
			while(m.size()>k && lo < i) {
				if(m.get(a[lo])==1) m.remove(a[lo]);
				else m.put(a[lo],m.get(a[lo])-1);
				tot--;
				lo++;
			}
			sum += tot;
		}
		System.out.println(sum);
	}

}
