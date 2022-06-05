import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.PrintWriter;


public class Main{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int [][]arr = new int[3][3];
		boolean [][]bango = new boolean[3][3];
		for(int i=0; i< 3; i++)
			for(int j=0; j<3; j++)
				arr[i][j] = in.nextInt();
		int n = in.nextInt();
		for(int k=0; k<n; k++){
			int num = in.nextInt();
			for(int i=0; i<3; i++){
				for(int j=0; j< 3; j++)
				{
					if(arr[i][j]==num)
					{
						bango[i][j] =true;
					}
				}
			}
		} // end
		if( (bango[0][0]==true && bango[1][1]==true && bango[2][2]==true) ||
		  (bango[0][0]==true && bango[0][1]==true && bango[0][2]==true) 
		  || (bango[1][0] ==true && bango[1][1] ==true && bango[1][2] ==true)
		  || (bango[2][0] ==true && bango[2][1] ==true && bango[2][2] ==true)||
		    (bango[0][0] ==true && bango[1][0] ==true && bango[2][0] ==true)||
		    (bango[0][1] ==true && bango[1][1] ==true && bango[2][1] ==true) ||
		    (bango[0][2] ==true && bango[1][2] ==true && bango[2][2] ==true) ||
		    (bango[0][2]==true && bango[1][1] == true && bango[2][0]==true)) 
		    out.println("Yes");
		else
			out.println("No");
		out.flush();
	}
}