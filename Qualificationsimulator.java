import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		char []arr = br.readLine().toCharArray();
		int cnt1 = 0, cnt2 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'a') {
				if (cnt1 < (a + b)) {
					cnt1++;
					out.println("Yes");
				} else {
					out.println("No");
				}
			} else if (arr[i] == 'b') {
				if (cnt1 < (a + b) && cnt2 < b) {
					cnt1++;
					cnt2++;
					out.println("Yes");
				} else{
					out.println("No");
				}
			} else {
				out.println("No");
			}
		} 		
		out.flush();
	}
}