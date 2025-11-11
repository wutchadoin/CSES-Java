import java.util.*;
import java.io.*;
public class projectsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		TreeSet<Integer> s = new TreeSet<>();
		int[][] edges = new int[n][3];
		Map<Integer,List<int[]>> list = new HashMap<>();
		for(int i =0 ; i < n; i++) {
			StringTokenizer f=  new StringTokenizer(in.readLine());
			
			edges[i][0] = Integer.parseInt(f.nextToken());
			edges[i][1] = Integer.parseInt(f.nextToken());
			edges[i][2] = Integer.parseInt(f.nextToken());
			s.add(edges[i][0]);
			s.add(edges[i][1]);
			if(!list.containsKey(edges[i][1])) list.put(edges[i][1],new ArrayList<>());
			list.get(edges[i][1]).add(edges[i]);
		}
		List<Integer> l = new ArrayList<>(s);
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 0; i < l.size(); i++) m.put(l.get(i), i);
		long[] dp = new long[l.size()];
		for(int i = 0; i < dp.length; i++) {
			if(i>0) {
				dp[i] = dp[i-1];
			}
			if(!list.containsKey(l.get(i))) continue;
			for(int[] a: list.get(l.get(i))) {
				dp[i] = Math.max(dp[i], dp[m.get(a[0])-1 > -1 ? m.get(a[0])-1 : 0]+a[2]);
			}
		}
		//for(int i = 0; i < dp.length; i++) System.out.print(dp[i] + " ");
		System.out.println(dp[dp.length-1]);
	}

}
