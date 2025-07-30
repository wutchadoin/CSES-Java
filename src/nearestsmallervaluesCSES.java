import java.util.*;
import java.io.*;
public class nearestsmallervaluesCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) a[i] = Integer.parseInt(f.nextToken());
		
		Stack<Integer> s = new Stack<>();
		StringBuilder ret = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(s.isEmpty()) {
				ret.append(0 + " ");
				s.push(i);
				continue;
			}
			int cur = a[i];
			while(!s.isEmpty() && a[s.peek()] >= cur) {
				s.pop();
				//System.out.println(s.pop() + " " + i);
			}
			if(s.isEmpty()) {
				ret.append(0 + " ");
			}else {
				ret.append(s.peek() + " ");
			}
			
			s.push(i);
		}
		System.out.println(ret.toString().trim());
		
	}

}
