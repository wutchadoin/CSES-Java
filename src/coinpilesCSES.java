import java.util.*;
import java.io.*;

public class coinpilesCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int t = 0; t < n; t++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			int x = Integer.parseInt(f.nextToken());
			int y = Integer.parseInt(f.nextToken());
			
			if(x < y) {
				int temp = x;
				x = y;
				y = temp;
			}
			
			if(x-y > 0) {
				if(x-y > y) {
					System.out.println("NO");
				}else {
					y-=(x-y);
					if(y%3==0) {
						System.out.println("YES");
					}else System.out.println("NO");
				}
			}else {
				if(x%3==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}
	}

}
