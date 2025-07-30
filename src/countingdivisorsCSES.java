import java.util.*;
import java.io.*;

public class countingdivisorsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n ; i++) {
			int t = Integer.parseInt(in.readLine());
			System.out.println(solve(t));
		}
	}
	
	public static int solve(int num) {
		int ret = 1;
		
		for(int i = 2; i*i<=num; i++) {
			int count = 1;
			while(num%i==0) {
				count++;
				num/=i;
			}
			ret*=count;
			
		}
		if(num>1) ret*=2;
		
		return ret;
	}

}
