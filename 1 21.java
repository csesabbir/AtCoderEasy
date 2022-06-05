import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		String str = st.nextToken() + "" + st.nextToken();
		int n = Integer.parseInt(str);
		int sq = (int)Math.sqrt(n);
		if (sq * sq == n) {
			out.println("Yes");
		} else {
			out.println("No");
		}
		out.flush();
	}
}