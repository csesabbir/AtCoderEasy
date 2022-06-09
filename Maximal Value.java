import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		int []b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int []a = new int[n];
		a[0] = b[0];
		a[n - 1] = b[n - 2];
		for (int i = 1; i < n - 1; i++) {
			a[i] = Math.min(b[i], b[i - 1]);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		out.println(sum);
		out.flush();
	}
}