import java.util.*;
import java.io.*;
public class exponentiationIICSES {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(in.readLine());
		while(t-->0) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			
			long c = Long.parseLong(f.nextToken());
			long a = Long.parseLong(f.nextToken());
			long b = Long.parseLong(f.nextToken());
			long bc = 0;
			if(a==0 && b==0) {
				bc = 1;
			}else if(a==0){
				bc = 0;
			}else if(b==0) bc = 1;
			else {
				long mod = (long)1E9+7;
				
				Map<Long, Long> m = new HashMap<>();
				long running = a;
				long r = 1;
				while(r <= (long)(1e9)) {
					m.put(r, running);
					//System.out.println(r + " " + running);
					running*=running;
					running%=mod;
					r*=2;
				}
				long ret = 1;
				while(r>0) {
					if(r <= b) {
						//System.out.println(r);
						ret*=m.get(r);
						ret%=mod;
						b-=r;
					}
					r>>=1;
				}
				
				bc = ret;
			}
			if(c==0 && bc==0) {
				out.println(1);
			}else if(c==0){
				out.println(0);
			}else if(bc==0) out.println(1);
			else {
				long mod = (long)1E9+7;
				
				Map<Long, Long> m = new HashMap<>();
				long running = c;
				long r = 1;
				while(r <= (long)(1e9)) {
					m.put(r, running);
					//System.out.println(r + " " + running);
					running*=running;
					running%=mod;
					r*=2;
				}
				long ret = 1;
				while(r>0) {
					if(r <= bc) {
						//System.out.println(r);
						ret*=m.get(r);
						ret%=mod;
						bc-=r;
					}
					r>>=1;
				}
				
				out.println(ret);
			}
			
		}
		out.close();

	}

}
