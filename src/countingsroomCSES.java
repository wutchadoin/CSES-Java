import java.util.*;
import java.io.*;
public class countingsroomCSES {

	static String[] arr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		arr = new String[n];
		
		for(int i = 0; i < n ; i++) {
			arr[i] = new StringTokenizer(in.readLine()).nextToken();
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i].charAt(j) == '#') continue;
				floodfill(i,j);
				count++;
			}
		}
		out.println(count);
		out.close();
	}
	
	public static void floodfill(int y, int x) {
		if(y >= 0 && y < arr.length && x >= 0 && x < arr[y].length() && arr[y].charAt(x) == '.') {
				arr[y] = arr[y].substring(0,x) + '#' + arr[y].substring(x+1);
				floodfill(y+1,x);
				floodfill(y-1,x);
				floodfill(y,x+1);
				floodfill(y,x-1);
		}
	}

}
