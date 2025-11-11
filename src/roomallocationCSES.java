
import java.util.*;
import java.io.*;
//program does not run in time for java, too slow


public class roomallocationCSES {
	
	static int[] ret;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(in.readLine());
		
		P[] a = new P[2*n];
		ret = new int[n];
		
		for(int i = 0; i < 2*n; i+=2) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			int x = Integer.parseInt(f.nextToken());
			int y = Integer.parseInt(f.nextToken());
			
			a[i] = new P(x,true,i/2);
			a[i+1] = new P(y,false,i/2);
			
		}
		
		Arrays.sort(a);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int count = 1;
		for(int i = 0; i < 2*n; i++) {
			if(a[i].front) {
				if(!pq.isEmpty()) {
					int lo = pq.poll();
					ret[a[i].ind] = lo;
				}else {
					ret[a[i].ind] = count;
					count++;
				}
			}else {
				pq.add(ret[a[i].ind]);
			}
		}
		
		out.println(count-1);
		StringBuilder s = new StringBuilder();
		s.append(ret[0]);
		for(int i = 1; i < n; i++) s.append(" " + ret[i]);
		out.println(s);
		out.close();
		//System.out.println(System.currentTimeMillis()/1000.0-start);
	}
	
	public static class P implements Comparable<P>{
		int pos;
		boolean front;
		int ind;
		
		public P(int pos, boolean front, int ind) {
			this.pos = pos;
			this.front = front;
			this.ind = ind;
		}

		@Override
		public int compareTo(roomallocationCSES.P o) {
			if(this.pos == o.pos) return (this.front ? 0 : 1) - (o.front ? 0 : 1);
			return this.pos-o.pos;
		}
		
	}

}
