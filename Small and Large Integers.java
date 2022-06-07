import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
		HashSet<Long> hs = new HashSet<>();
		ArrayList<Long> arr1 = new ArrayList<>();
		for (int i = 1; i <= k; i++) {
			if (a > b) {
				break;
			}
			arr1.add(a);
			hs.add(a);
			a++;
		}
		ArrayList<Long> arr2 = new ArrayList<>();
		for (int i = 1; i <= k; i++) {
			if (a > b) {
				break;
			}
			if (hs.contains(b)) {
				break;
			}
			arr2.add(b);
			hs.add(b);
			b--;
		}
		for (long i : arr1) {
			out.println(i);
		}
		for (int i = arr2.size() - 1; i >= 0; i--) {
			out.println(arr2.get(i));
		}
		out.flush();
	}
}