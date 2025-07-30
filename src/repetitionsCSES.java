import java.util.*;
import java.io.*;

public class repetitionsCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n = new StringTokenizer(in.readLine()).nextToken();
		
		int count = 0;
		int ret = 0;
		char cur = ' ';
		for(int i = 0; i < n.length();i++) {
			if(cur != n.charAt(i)) {
				ret = Math.max(ret, count);
				count = 1;
				cur = n.charAt(i);
			}else if(cur == n.charAt(i)) count++;
		}
		ret = Math.max(ret, count);
		System.out.println(ret);

	}

}
