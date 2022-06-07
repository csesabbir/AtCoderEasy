import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		boolean flag = false;
		for (double i = 1; i <= 1009.0; i++) {
			int r1 = (int)Math.floor((int)(i * 0.08));
			int r2 = (int)Math.floor((i * 0.1));
			if (r1 == a && r2 == b) {
				out.println(((int)i));
				flag = true;
				break;
			}
		}
		if (!flag) {
			out.println("-1");
		}
		out.flush();
	}
}