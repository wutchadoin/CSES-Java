import java.util.*;
import java.io.*;
public class staticrangesumqueriesCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		long[] pref = new long[n+1];
		for(int i = 1; i <= n; i++) {
			pref[i] = pref[i-1] + Long.parseLong(f1.nextToken());
		}
		while(m-->0) {
			StringTokenizer f2 = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(f2.nextToken());
			int b = Integer.parseInt(f2.nextToken());
			
			out.println(pref[b]-pref[a-1]);
		}
		out.close();
	}

}
