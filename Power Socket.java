import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int tmp = a, strip = 1;
		int cnt = 0;
		while (strip < b) {
			--strip;
			cnt++;
			strip += tmp;
		}
		out.println(cnt);
		out.flush();
	}
}