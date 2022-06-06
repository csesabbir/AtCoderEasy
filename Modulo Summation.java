import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		int []arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += arr[i] - 1;
		}
		out.println(res);
		out.flush();
	}
}