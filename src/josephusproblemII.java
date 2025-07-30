import java.util.*;
import java.io.*;
public class josephusproblemII {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int k = Integer.parseInt(f.nextToken());
		
		List<Integer> l = new ArrayList<>();
		
		for(int i = 1; i<=n;i++) l.add(i);
		
		int pos = 0;
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < n; i++) {
			pos = (pos + k)%l.size();
			s.append(l.remove(pos) + " ");
		}
		System.out.println(s.toString().trim());
		
	}

}
