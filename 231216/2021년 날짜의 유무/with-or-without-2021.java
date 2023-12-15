import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());
        System.out.println(f(M, D));
    }
    public static String f(int m, int d){
        if(m < 0 || m > 12) return "No";
        if(d <= 0) return "No";
        if(m ==2){
            if( d <= 28) return "Yes";
            else return "No";
        }
        if(m==4 || m==6 || m==9 || m==11){
            if( d<=30) return "Yes";
            else return "No";
        } else if( d<= 31) {
            return "Yes";
        } else return "No";
    }
}