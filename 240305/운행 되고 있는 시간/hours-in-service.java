import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] a = new int [n][2];
        StringTokenizer stk;
        for(int i = 0 ; i < n ; i ++){
            stk = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(stk.nextToken());
            a[i][1] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int [] arr = new int [1001];
            for(int j = 0; j < n ; j++){
                if(i == j) continue;
                for(int k = a[j][0]; k < a[j][1]; k++){
                    arr[k]++;
                }
            }
            int cnt = 0;
            for(int k = 0 ; k <= 1000; k++){
                if(arr[k] > 0) {
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}