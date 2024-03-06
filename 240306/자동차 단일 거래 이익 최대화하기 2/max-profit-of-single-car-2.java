import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        int prev = -1;
        for(int i = 0 ; i < n ; i++){
            if(prev == -1) {
                prev = arr[i];
                continue;
            }
            int diff = arr[i] - prev;
            if(diff < 0){
                prev = arr[i];
                continue;
            }
            ans = Math.max(ans, diff);
            prev = arr[i];
        }
        System.out.println(ans);
    }
}