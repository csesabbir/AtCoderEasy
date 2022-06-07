import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int i = 1;
		int sum = 0;
		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			i++;
		}
		int m = Integer.parseInt(br.readLine());
		for (int j = 1; j <= m; j++) {
			st = new StringTokenizer (br.readLine(), " ", false);
			int id = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			sum -= arr[id];
			sum += value;
			out.println(sum);
			sum += arr[id];
			sum -= value;
		}
		out.flush();
	}
}