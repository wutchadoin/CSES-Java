import java.util.*;
import java.io.*;
public class removingdigitsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			int[] digits = new int[10];
			int j = i;
			while(j > 0) {
				digits[j%10]++;
				j/=10;
			}
			int min = Integer.MAX_VALUE;
			for(int k = 1; k < digits.length; k++) {
				if(digits[k] > 0) min = Math.min(min, a[i-k]);
			}
			a[i] = min+1;
		}
		System.out.println(a[n]);
	}

}
