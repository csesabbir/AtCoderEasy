import java.io.*;
import java.util.*;

public class Main {
	public static void main (String []args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		int []arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			for (int value : arr) {
				sum += ((value - i) * (value - i));
			}
			ans = Math.min(sum, ans);
		}
		out.println(ans);
		out.flush();
	}
}