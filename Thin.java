import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int row = Integer.parseInt(st.nextToken()), col = Integer.parseInt(st.nextToken());
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < row; i++) {
			String str = br.readLine();
			arr.add(str);
			arr.add(str);
		}
		for (String str : arr) {
			out.println(str);
		}
		out.flush();
	}
}