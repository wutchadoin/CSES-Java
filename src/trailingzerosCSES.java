import java.util.*;
import java.io.*;
public class trailingzerosCSES {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int ret = 0;
		
		while(n > 0) {
			ret+=(n/5);
			n/=5;
		}
		System.out.println(ret);		
	}

}
