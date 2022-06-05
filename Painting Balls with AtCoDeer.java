import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int res = k;
		for (int i = n - 1; i >= 1; i--) {
			res *= (k - 1);
		}
		out.println(res);
		out.flush();
	}
}