import java.util.*;
import java.io.*;
public class highscore {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer f = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(f.nextToken());
		int m = Integer.parseInt(f.nextToken());
		int q = Integer.parseInt(f.nextToken());
		
		long[][] dist = new long[n+1][n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(f1.nextToken());
			int b = Integer.parseInt(f1.nextToken());
			long c = Long.parseLong(f1.nextToken());
			if(dist[a][b] > 0) {
				dist[a][b] = Math.min(dist[a][b], c);
			}else {
				dist[a][b] = c;
			}
			dist[b][a] = dist[a][b];
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==j) dist[i][j] = 0;
				else if(dist[i][j] == 0) dist[i][j] = (long)1E14;
			}
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <=n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[j][k]);
					dist[j][i] = dist[i][j];
				}
			}
		}
		
		while(q-->0) {
			StringTokenizer f1 = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(f1.nextToken());
			int b = Integer.parseInt(f1.nextToken());
			out.println(dist[a][b] == (long)1e14 ? -1 : dist[a][b]);
		}
		out.close();
		
	}

}
