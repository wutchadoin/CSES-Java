import java.util.*;
import java.io.*;
public class stringreorderCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String ss = in.readLine();
		
		int[] count = new int[26];
		for(int i = 0; i < ss.length(); i++) count[ss.charAt(i)-'A']++;
		char[] abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int lo = 0;
		StringBuilder s = new StringBuilder();
		while(lo < 26 && count[lo] == 0) lo++;
		int hi = lo+1;
		while(hi < 26 && count[hi] == 0) hi++;
		
		if(hi >= 26) System.out.println(-1);
		else {
			while(true) {
				for(int i = 0; i < Math.min(count[lo], count[hi]); i++) {
					s.append(abc[lo]);
					s.append(abc[hi]);
				}
				if(count[lo] < count[hi]) {
					
				}else if(count[lo] == count[hi]){
					
				}else {
					
				}
				
				
			}
		}
		
	}

}
