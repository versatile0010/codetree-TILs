import java.io.*;
import java.util.*;

public class Main {
    static int [] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n==0) return a[0];
        return lcm(f(n-1), a[n-1]);
    }

    public static int gcd(int a, int b){ // 5 3 
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }

}