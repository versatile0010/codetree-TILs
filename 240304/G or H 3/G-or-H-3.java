import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken()) + 1;

        int [] a = new int [10001];
        for(int i = 0; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(stk.nextToken());
            String x = stk.nextToken();
            if("G".equals(x)){
                a[p] = 1;
            } else {
                a[p] = 2;
            }
        }
        int ans = 0;
        for(int i = 1 ; i <= 10000 - k; i++){
            int t = 0;
            for(int j = i; j < i + k; j++){
                t += a[j];
            }
            ans = Math.max(ans, t);
        }
        System.out.println(ans);
    }
}