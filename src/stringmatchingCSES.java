import java.util.*;
import java.io.*;
public class stringmatchingCSES { //use KMP, not this

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String ss = in.readLine();
		int count = 0;
		for(int i = 0; i < s.length()-ss.length()+1; i++) {
			if(ss.equals(s.substring(i,i+ss.length()))) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
