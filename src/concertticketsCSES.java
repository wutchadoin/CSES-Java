import java.util.*;
import java.io.*;
public class concertticketsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		f = new StringTokenizer(in.readLine());
		TreeMap<Integer,Integer> tickets = new TreeMap<>();
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(f.nextToken());
			if(tickets.containsKey(a)) tickets.put(a, tickets.get(a) + 1);
			else tickets.put(a, 1);
		}
		
		f = new StringTokenizer(in.readLine());
		for(int i = 0; i < m; i++) {
			int cow = Integer.parseInt(f.nextToken());
			if(tickets.floorKey(cow) == null) {
				out.println("-1");
				continue;
			}
			Map.Entry<Integer, Integer> tick = tickets.floorEntry(cow);
			out.println(tick.getKey());
			if(tickets.get(tick.getKey()) == 1) tickets.remove(tick.getKey());
			else tickets.put(tick.getKey(), tickets.get(tick.getKey())-1);
			//if(tick != null) out.println(cow);
		}
		out.close();
	}

}
