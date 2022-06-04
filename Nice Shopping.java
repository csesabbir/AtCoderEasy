import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int a = Integer.parseInt (st.nextToken()), b = Integer.parseInt (st.nextToken()), m = Integer.parseInt(st.nextToken());
		int []aa = new int[a + 1];
		int []bb = new int[b + 1];
		st = new StringTokenizer (br.readLine(), " ", false);
		int i = 1;
		int mina = Integer.MAX_VALUE;
		while (st.hasMoreTokens()) {
			aa[i] = Integer.parseInt(st.nextToken());
			mina = Math.min(aa[i], mina);
			i++;
		}
		st = new StringTokenizer (br.readLine(), " ", false);
		i = 1;
		int minb = Integer.MAX_VALUE;
		while (st.hasMoreTokens()) {
			bb[i] = Integer.parseInt(st.nextToken());
			minb = Math.min(minb, bb[i]);
			i++;
		}
		int ans = mina + minb;
		for (i = 1; i <= m; i++) {
			st = new StringTokenizer (br.readLine(), " ", false);
			int apos = Integer.parseInt(st.nextToken());
			int bpos = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			ans = Math.min(ans, aa[apos] + bb[bpos] - value);
		}
		out.println(ans);
		out.flush();
	}
}