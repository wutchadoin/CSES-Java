import java.util.*;
import java.io.*;
public class distinctvaluessubsequencesCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		HashMap<Integer,Integer> s = new HashMap<>();
		for(int i = 0; i < n ;i++) {
			int c = Integer.parseInt(f.nextToken());
			s.put(c, s.getOrDefault(c,0)+1);
		}
		long sum = 1;
		for(int i: s.keySet()) {
			sum*=(s.get(i)+1);
			sum%=((long)1e9+7);
		}
		System.out.println(sum-1);
		
		
		
	}

}
