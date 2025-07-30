import java.util.*;
import java.io.*;
public class missingnumberCSES{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
		boolean[] e = new boolean[n+1];
		StringTokenizer p = new StringTokenizer(in.readLine());
		for(int i = 0; i < n-1; i++) {
			e[Integer.parseInt(p.nextToken())] = true;
		}
		for(int i = 1; i <= n; i++) {
			if(e[i] == false) System.out.println(i);
		}
		
	}
}
