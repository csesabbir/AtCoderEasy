import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		String str1 = br.readLine();
		String str2 = br.readLine();
		BigInteger b1 = new BigInteger(str1);
		BigInteger b2 = new BigInteger(str2);
		int res = b1.compareTo(b2);
		if (res == 0) {
			out.println("EQUAL");
		} else if (res > 0) {
			out.println("GREATER");
		} else {
			out.println("LESS");
		}
		out.flush();
	}
}