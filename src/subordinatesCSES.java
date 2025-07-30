import java.util.*;
import java.io.*;

public class subordinatesCSES {

	static List<Integer>[] employees;
	static int[] count;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		
		employees = new ArrayList[n+1];
		count = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			employees[i] = new ArrayList<>();
		}
		
		StringTokenizer f = new StringTokenizer(in.readLine());
		for(int i = 2; i <= n; i++) {
			int boss = Integer.parseInt(f.nextToken());
			
			//if(employees[boss] == null) employees[boss] = new ArrayList<>();
			employees[boss].add(i);
		}
		
		dfs(1);
		StringBuilder e = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			e.append(count[i]);
			e.append(" ");
		}
		out.println(e.toString());
		out.close();

	}
	
	public static void dfs(int cur) {
		//if(employees[cur].isEmpty()) return;
		
		for(int val: employees[cur]) {
			dfs(val);
			count[cur]+=count[val] + 1;
		}
	}
	

}
