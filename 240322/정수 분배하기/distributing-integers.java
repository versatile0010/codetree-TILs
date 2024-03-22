import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        arr = new int [n];

        int l = 1;
        int r = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            r = Math.max(r, arr[i]);
        }
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossible(mid)){
                l = mid + 1;
                ans = Math.max(ans, mid);
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPossible(int x){
        int t = 0;
        for(int i = 0 ; i < n; i++){
            t += arr[i]/x;
        }
        return t >= m;
    }
}