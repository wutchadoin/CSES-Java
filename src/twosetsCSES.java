import java.util.*;
import java.io.*;

public class twosetsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = (long)Integer.parseInt(in.readLine());
		
		long sum = (n+1)*n/2;
		if(sum%2==1) {
			System.out.println("NO");
		}else {
			sum/=2;
			System.out.println("YES");
			TreeSet<Long> t = new TreeSet<>();
			TreeSet<Long> t1 = new TreeSet<>();
			
			for(long i = 1; i <= n; i++) {
				t.add(i);
			}
			while(sum > 0) {
				long c = t.floor(sum);
				sum-=c;
				t1.add(c);
				t.remove(c);
			}
			
			StringBuilder s = new StringBuilder();
			System.out.println(t.size());
			for(long i: t) s.append(i+" ");
			System.out.println(s.toString().trim());
			s=new StringBuilder();
			System.out.println(t1.size());
			for(long i: t1) s.append(i+" ");
			System.out.println(s.toString().trim());
			
			
		}
		
	}

}
