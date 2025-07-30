import java.util.*;
import java.io.*;
public class numberspiralCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			long y = (long)Integer.parseInt(f.nextToken());
			long x = (long)Integer.parseInt(f.nextToken());
			
			
			
			if(y > x) {
				long y1 = (y-1)*(y-1);
				y*=y;
				
				if(y%2==0) {
					out.println(y-x+1);
				}else {
					out.println(y1+x);
				}
				
			}else{
				long x1 = (x-1)*(x-1);
				x*=x;
				
				if(x%2==1) {
					out.println(x-y+1);
				}else {
					out.println(x1+y);
				}
			}
			
		}
		out.close();

	}

}
