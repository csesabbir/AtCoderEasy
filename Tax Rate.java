import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		boolean flag = false;
		for (double i = 1.0; i <= 50000.0; i++) {
			int p = (int)((i * 0.08) + i);
			if (n == p){
				out.println((int)(i));
				flag = true;
				break;
			}

		}
		if (!flag) {
			out.println(":(");
		}
		out.flush();
	}
}