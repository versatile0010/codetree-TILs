import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        int [][] p = new int[101][2];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(stk.nextToken());
            p[i][1] = Integer.parseInt(stk.nextToken());
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < n; j++){
                if( i == j ) continue;
                int d = (p[i][0] - p[j][0]) * (p[i][0] - p[j][0]) + (p[i][1] - p[j][1]) * (p[i][1] - p[j][1]);
                ans = Math.min(ans, d);
            }
        }
        System.out.println(ans);
    }
}