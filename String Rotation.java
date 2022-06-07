import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		char []arr = br.readLine().toCharArray();
		String str2 = br.readLine();
		boolean flag = false;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (str2.equals(new String(arr))) {
				out.println("Yes");
				flag = true;
				break;
			}
			char tmp = arr[n - 1];
			for (int j = n - 1; j >= 1; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = tmp;
		}
		if (!flag) {
			out.println("No");
		}
		out.flush();
	}
}