import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int [n];
        for(int i = 0 ; i < n; i ++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n; i ++){
            if (sum < 0) {
                sum = 0;
            }
            sum += a[i];
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}