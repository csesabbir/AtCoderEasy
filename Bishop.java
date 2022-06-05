import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		long row = Long.parseLong(st.nextToken()), col = Long.parseLong(st.nextToken());
		long res = 0L;
		if (row == 1L || col == 1L) {
			res = 1L;
		} else {
			res = (row * col) / 2L + (row * col)% 2L;
		}
		out.println(res);
		out.flush();
	}
}