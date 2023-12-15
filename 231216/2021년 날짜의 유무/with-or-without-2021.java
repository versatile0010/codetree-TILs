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
        if(m == 2 && (1 <= d && d <= 28)) return "Yes";
        if(m != 2 && (1<= d && d <= 31)) return "Yes";
        return "No"; 
    }
}