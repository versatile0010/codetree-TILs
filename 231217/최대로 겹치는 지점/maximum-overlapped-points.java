import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[101];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            for(int j = st ; j <= end; j++){
                a[j]++;
            }
        }
        int ans = -1;
        for(int i = 0 ; i <= 100; i++){
            ans = Math.max(ans, a[i]);
        }
        System.out.println(ans);
    }
}