import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int n = Integer.parseInt(in.nextLine());
            manual []arr = new manual[n];
            for(int i=1; i<=n; i++){
                String []ss = in.nextLine().split(" ");
                arr[i-1] = new manual(i,ss[0],Integer.parseInt(ss[1]));
            }
            Arrays.sort(arr);
            for(int i=0; i< n; i++)
                out.println(arr[i].idx);
        out.flush();
    }
    static class manual implements  Comparable<manual>{
        public int idx;
        public String name;
        public int s;
        public manual(int idx, String name, int s){
            this.idx = idx;
            this.name = name;
            this.s = s;
        }
        @Override
        public int compareTo(manual m){
            int rr = this.name.compareTo(m.name);
            if(rr==0)
                return m.s - this.s;
            else if(rr>0)
                return 1;
            else
                return -1;
        }
    }
}