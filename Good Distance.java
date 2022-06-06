import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		int [][]arr = new int[n][d];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int rr = 0;
				for (int k = 0; k < d; k++) {
					rr += (arr[i][k] - arr[j][k]) * (arr[i][k] - arr[j][k]);
				}
				int ss = (int)Math.sqrt(rr);
				if (ss * ss == rr) {
					++ans;
				}
			}
		}
		out.println(ans);
		out.flush();
	}
}