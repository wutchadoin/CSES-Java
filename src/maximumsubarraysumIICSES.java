import java.util.*;
import java.io.*;
public class maximumsubarraysumIICSES{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int a = Integer.parseInt(f.nextToken());
		int b = Integer.parseInt(f.nextToken());
		
		long max = 0;
		Deque<Long> dq = new ArrayDeque<>();
		while(dq.size()<a) {
			long c = Long.parseLong(f1.nextToken());
			max+=c;
			dq.add(c);
			n--;
		}
		long run = max;
		long min = run;
		while(n>0) {
			long c = Long.parseLong(f1.nextToken());
			run += c;
			dq.add(c);
			while(dq.size() > b) {
				long pop = dq.remove();
				run-=pop;
			}
			max = Math.max(run, max);
			
		}
		System.out.println(max);
	}
}