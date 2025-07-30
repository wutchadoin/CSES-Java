import java.util.*;
import java.io.*;

public class commondivisorsCSES {
	
	static Set<Integer> set;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		set = new HashSet<>();
		int max = 1;
		for(int i = 0; i < n ; i++) {
			max = Math.max(countDivs(Integer.parseInt(f.nextToken())),max);
		}
		System.out.println(max);
		
	}
	
	public static int countDivs(int n) {
		int r = 1;
		//System.out.println(n);
		for(int i = 1; i*i<=n; i++) {
			if(n%i==0) {
				//System.out.println(i + " " + n/i);
				if(set.contains(n/i)) r = Math.max(n/i, r);
				else set.add(n/i);
				if(set.contains(i) && n/i != i) r = Math.max(i, r);
				else set.add(i);
			}
		}
		return r;
	}

}
