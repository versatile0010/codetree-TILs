import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int t = Integer.parseInt(stk.nextToken());
        int [] arr = new int[n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ;  i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = -1; int cnt = 0;
        for(int i = 0; i < n ; i++){
            if(i==0 || (arr[i] > t && arr[i-1] > t)){
                cnt++;
                ans = Math.max(cnt, ans);
            } else {
                cnt = 1;
            }
        }
        System.out.println(ans);
    }
}