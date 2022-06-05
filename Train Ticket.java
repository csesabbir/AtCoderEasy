import java.util.*;
import java.io.*;

public class Main {
	public static String str1 = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		String str = br.readLine();
		int []arr = new int[4];
		arr[0] = str.charAt(0) - '0';
		arr[1] = str.charAt(1) - '0';
		arr[2] = str.charAt(2) - '0';
		arr[3] = str.charAt(3) - '0';
		for (int mask = 0; mask < (1 << (4 - 1)); mask++) {
			int []tmp = new int[3];
			//tmp[0] = arr[0];
			tmp[0] = arr[1];
			tmp[1] = arr[2];
			tmp[2] = arr[3];
			for (int i = 0; i < 3; i++) {
				if ((mask & (1 << i)) > 0) {
					tmp[i] *= -1;
				}
			}
			if (arr[0] + tmp[0] + tmp[1] + tmp[2] == 7) {
				str1 += "" + arr[0];
				for (int i = 0; i < 3; i++) {
					str1 += tmp[i] >=0 ? "+" + Integer.toString(tmp[i]): "" + Integer.toString(tmp[i]);
				}
				str1 += "=7";
				break;
			}
		}
		out.println(str1);
		out.flush();
	}
}