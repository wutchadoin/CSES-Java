import java.util.*;
import java.io.*;
public class ferriswheelCSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		StringTokenizer f1 = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		
		TreeMap<Integer,Integer> t = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			int cur = Integer.parseInt(f1.nextToken());
			t.put(cur, t.getOrDefault(cur, 0)+1);
		}
		
		int count = 0;
		boolean b = false;
		int cur = m;
		
		while(!t.isEmpty()) {
			int fl = (t.floorKey(cur)!=null ? t.floorKey(cur) : -1);
			if(fl==-1) {
				count++;
				cur = m;
			}else if(b){
				count++;
				cur = m;
				b = false;
				if(t.get(fl) == 1) t.remove(fl);
				else t.put(fl, t.get(fl)-1);
			}else {
				//System.out.println(fl);
				cur-=fl;
				if(t.get(fl) == 1) t.remove(fl);
				else t.put(fl, t.get(fl)-1);
				b = true;
				
			}
		}
		if(cur!=m) count++;
		
		System.out.println(count);
		
		
		
		
		
		//System.out.println(c);
	
	}

}
