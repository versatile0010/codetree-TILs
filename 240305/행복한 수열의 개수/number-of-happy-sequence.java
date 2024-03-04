import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int [][] a = new int[n][n];

        for(int i =0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                a[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int [] t = new int[n];

        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            int idx = 0;
            for(int j = 0; j < n; j++){
                t[idx++] = a[i][j];
            }
            if(isHappy(t, n, m)){
                cnt++;
            }
        }

        for(int i = 0 ; i < n ; i++){
            int idx = 0;
            for(int j = 0 ; j < n ; j++){
                t[idx++] = a[j][i];
            }
            if(isHappy(t, n, m)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isHappy(int [] t, int n, int m){
        int cnt = 1;
        int maxi = 1;
        for(int i = 1; i < n ; i++){
            if(t[i-1] == t[i]){
                cnt++;
            } else {
                cnt = 1;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi >= m;
    }
}