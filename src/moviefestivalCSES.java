import java.util.*;
import java.io.*;

public class moviefestivalCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int[][] e = new int[n][];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());

			e[i] = new int[] {Integer.parseInt(f.nextToken()),Integer.parseInt(f.nextToken())};
		}
		
		Arrays.sort(e, (a,b) -> a[1] - b[1]);
		/*
		for(int[] v: e) {
			System.out.println(v[0] + " " + v[1]);
		}
		*/
		int pos = 0;
		int max = 0;
		for(int i = 0; i < n ;i++) {
			if(e[i][0] >= pos) {
				pos = e[i][1];
				max++;
			}
		}
		System.out.println(max);
	
		
		
	}

}
