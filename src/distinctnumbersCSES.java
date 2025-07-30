import java.util.*;
import java.io.*;
public class distinctnumbersCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer f = new StringTokenizer(in.readLine());
		Set<Integer> a = new HashSet<>();
		
		for(int i = 0; i < n; i++) a.add(Integer.parseInt(f.nextToken()));
	
		System.out.println(a.size());
	
	}

}
