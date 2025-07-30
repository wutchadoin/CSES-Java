import java.util.*;
import java.io.*;
public class readingbooksCSES {

	public static void main(String[] args) throws Exception{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		long time = 0;
		
		PriorityQueue<Point> q = new PriorityQueue<>();
		
		long[] a = new long[n];
		boolean[] reading = new boolean[n];
		
		for(int i = 0; i < n; i++) a[i] = Long.parseLong(f.nextToken());
		
		int lo = 0;
		int hi = n-1;

		if(n == 1) System.out.println(2*a[0]);
		else {
			
		}
		
	}
	
	public static class Point implements Comparable<Point>{
		long time;
		int p;
		Point(int p, long time){
			this.p = p;
			this.time = time;
		}
		@Override
		public int compareTo(readingbooksCSES.Point o) {
			return (int)(this.time-o.time);
		}
	}

}
