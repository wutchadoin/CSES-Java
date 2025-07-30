import java.io.*;
import java.util.*;
public class increasingarrayCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
		StringTokenizer f = new StringTokenizer(in.readLine());
		long prev = 0;
		long sum = 0;
		for(int i = 0; i < n ; i++) {
			long cur = Long.parseLong(f.nextToken());
			//System.out.println(cur);
			if(i == 0) prev = cur;
			else if(cur < prev) sum += (prev-cur);
			else prev = cur;
		}
		System.out.println(sum);

	}

}
