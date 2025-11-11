import java.util.*;
import java.io.*;
public class moviefestivalIICSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int k = Integer.parseInt(f.nextToken());
		
		int[][] a = new int[2*n][3];
		for(int i = 0; i < 2*n; i+=2) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			a[i][0] = Integer.parseInt(f1.nextToken());
			a[i+1][0] = Integer.parseInt(f1.nextToken());
			a[i][1] = 1;
			a[i+1][1] = -1;
			a[i][2] = i;
			a[i+1][2] = i;
		}
		Set<Integer> s = new HashSet<>();
		Arrays.sort(a,(b,c)->b[0]-c[0]==0?b[1]-c[1]:b[0]-c[0]);
		int kk = k;
		for(int i = 0; i < 2*n; i++) {
			//System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2]);
			if(a[i][1]==1) {
				if(kk>0) {
					kk--;
					s.add(a[i][2]);
				}
			}else {
				if(s.contains(a[i][2])) kk++;
			}
		}
		System.out.println(s.size());
	}

}
