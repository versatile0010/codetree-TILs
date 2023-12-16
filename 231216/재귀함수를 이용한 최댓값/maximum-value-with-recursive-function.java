import java.io.*;
import java.util.*;

public class Main {
    static int [] a;
    static int ans;
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
        if(n==0){
            return a[0];
        }
        return Math.max(f(n-1), a[n]);
    }
}