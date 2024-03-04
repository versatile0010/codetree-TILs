import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] p = new int[n][2];
        StringTokenizer stk;
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            p[i][0] = x;
            p[i][1] = y;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1 ; i < n-1 ; i++){
            int t = 0;
            int pidx = 0;
            for(int j = 1 ; j < n; j++){
                if(j == i) continue;
                t += getDistance(p[pidx], p[j]);
                pidx = j;
            }
            ans = Math.min(ans, t);
        }
        System.out.println(ans);
    }

    public static int getDistance(int [] a, int [] b){
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }

}