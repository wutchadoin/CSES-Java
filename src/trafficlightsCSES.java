import java.util.*;
import java.io.*;
public class trafficlightsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int x = Integer.parseInt(f.nextToken());
		
		TreeSet<Integer> e = new TreeSet<>();
		
		e.add(-1);
		e.add(x+1);
		
		int max = x;
		int lo = -1;
		int hi = x+1;
		
		int max2 = x;
		int lo2 = 0;
		int hi2 = 0;
		
		for(int i = 0; i < x; i++) {
			int c = Integer.parseInt(f1.nextToken());
			if(c > lo && c < hi) {
				int l = e.floor(c);
				int h = e.ceiling(c);
				
				
				
				
			}else {
				
			}
			
		}
		
		
	}

}
