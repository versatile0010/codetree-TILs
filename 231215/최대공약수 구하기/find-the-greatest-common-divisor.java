import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        System.out.println(gcd(n, m));
    }
    
    static int gcd(int n, int m){
        if(m == 0) return n;
        else return gcd(m, n%m);
    }

}