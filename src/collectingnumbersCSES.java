import java.util.*;
import java.io.*;
public class collectingnumbersCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 0; i < n ; i++) {
			m.put(Integer.parseInt(f.nextToken()), i);
		}
		int prev = -1;
		int c = 1;
		for(int i = 1; i <= n; i++) {
			if(prev > m.get(i)) {
				c++;
			}
			prev = m.get(i);
		}
		System.out.println(c);
		
	}

}
