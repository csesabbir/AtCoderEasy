import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
		long cnt = 0;
		for (; x <= y; x *= 2L) {
			cnt++;
		}
		out.println(cnt);
		out.flush();
	}
}