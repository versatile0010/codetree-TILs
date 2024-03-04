import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int [] a = new int [n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int i = 0; i < n-k; i++) {
            int t = 0;
            for(int j = i ; j < i+k; j++) {
                t += a[j];
            }
            ans = Math.max(ans, t);
        }
        System.out.println(ans);
    }
}