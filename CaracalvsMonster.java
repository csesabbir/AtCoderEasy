import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		long n = Long.parseLong(br.readLine());
		long res = solve(n);
		out.println(res);
		out.flush();
	}
	private static long solve(long n) {
		if (n == 1L) {
			return 1L;
		} else {
			return  2L * solve(n / 2) + 1L;
		}
	}
}