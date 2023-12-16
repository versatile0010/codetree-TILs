import java.io.*;
import java.util.*;

public class Main {
    static int [] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        System.out.println(f(n-1));
    }
    public static int f(int n){
        return n==0 ? a[0] : Math.max(f(n-1), a[n]);
    }
}