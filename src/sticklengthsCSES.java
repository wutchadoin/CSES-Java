import java.util.*;
import java.io.*;

public class sticklengthsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(f.nextToken());
		}
		Arrays.sort(arr);
		long max = arr[arr.length/2];
		
		long ret = 0;
		
		for(int i = 0; i < n; i++) {
			ret+=Math.abs(max-arr[i]);
		}
		
		System.out.println(ret);
		
	}

}
