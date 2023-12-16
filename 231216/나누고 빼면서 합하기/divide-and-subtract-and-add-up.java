import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());

        int [] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        System.out.println(f(a, m));
    }
    public static int f(int [] a , int m){
        int ret = a[m-1];
        while(m != 1) {
            if(m%2 == 1){
                m -= 1;
            } else if(m%2 == 0){
                m /= 2;
            }
            ret += a[m-1];
        }
        return ret;
    }

}