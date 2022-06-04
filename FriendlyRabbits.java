import java.io.*;
import java.util.*;

public class Main {
	public static void main (String []args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int i = 1; 
		while (st.hasMoreTokens()) {
			arr[i++] = Integer.parseInt(st.nextToken());
		}
		boolean []visit = new boolean[n + 1];
		int ans = 0;
		for (i = 1; i <= n; i++) {
			int tmp = arr[i];
			if (!visit[tmp] && !visit[i] && arr[tmp] == i) {
				visit[tmp] = visit[i] = true;
				ans++;
			}
		}	
		out.println(ans);
		out.flush();
	}
}