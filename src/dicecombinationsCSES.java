import java.io.*;
import java.util.StringTokenizer;

public class dicecombinationsCSES {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(r.readLine());

		int mod = (int)1E9+7;

		int[] a = new int[n];
		for(int i = 0; i < Math.min(6,n); i++){
			a[i] = 1;
		}

		for(int i = 0; i < n; i++){
			for(int j = i-1; j >= Math.max(i-6,0); j--){
				a[i] = (a[i] + a[j]);
				a[i]%=mod;
			}
		}
		System.out.println(a[n-1]);

	}
}