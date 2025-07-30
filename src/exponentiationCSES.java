import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exponentiationCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		BigInteger mod = new BigInteger("1000000007");
		
		for(int i = 0; i < n; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			BigInteger base = new BigInteger(f.nextToken());
			BigInteger exponent = new BigInteger(f.nextToken());
			
			if(exponent.equals(0)) System.out.println(1);
			else System.out.println(base.modPow(exponent,mod));
		}

	}
	
	public static int power(int a, int b) {
		if(b == 0) return 1;
		if(b == 1) return a;
		//int tmp = power(a,b/2)%(1E9+7);
		return 0;
		
	}

}
