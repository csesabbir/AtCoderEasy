import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int []b = new int[m];
		st = new StringTokenizer (br.readLine(), " ", false);
		int i = 0;
		while (st.hasMoreTokens()) {
			b[i++] = Integer.parseInt (st.nextToken());
		}
		int cnt = 0;
		for (i = 0; i < n; i++) {
			st = new StringTokenizer (br.readLine(), " ", false);
			int value = 0;
			int j = 0;
			while (st.hasMoreTokens()) {
				value += (b[j] * (Integer.parseInt(st.nextToken())));
				j++;
			}
			if (value + c > 0) {
				cnt++;
			}
		}
		out.println(cnt);
		out.flush();
	}
}