import java.util.*;
import java.io.*;

public class trafficlightsCSES {
	
	public static Set<Integer> set;
	public static int lo;
	public static int hi;
	static int n;

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(f.nextToken());
		int t = Integer.parseInt(f.nextToken());
		
		set = new TreeSet<>();
		
		lo = 0;
		hi = n;
		
		StringBuilder e = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			int cur = Integer.parseInt(f1.nextToken());
			
			if(lo <= cur && cur <= hi) {
				set.add(cur);
				lo = 0;
				hi = 0;
				recalc();
				e.append(hi-lo);
				e.append(" ");
			}else {
				e.append(hi-lo);
				e.append(" ");
				set.add(cur);
			}
		}
		System.out.println(e.toString());
	}
	
	public static void recalc() {
		Iterator<Integer> i = set.iterator();
		int prev = 0;
		while(i.hasNext()) {
			Integer in = (int)i.next();
			if(in-prev > hi - lo) {
				hi = in;
				lo = prev;
			}
			prev = in;
		}
		if(n-prev > hi-lo) {
			hi = n;
			lo = prev;
		}
	}

}
