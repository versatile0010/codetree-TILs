import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] p = new int[101][2];
        StringTokenizer stk;
        for(int i = 0 ; i < n ; i ++){
            stk = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(stk.nextToken());
            p[i][1] = Integer.parseInt(stk.nextToken());
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int w = 0;
            int min_x = Integer.MAX_VALUE;
            int min_y = Integer.MAX_VALUE;
            int max_x = 0;
            int max_y = 0;

            for(int j = 0 ; j < n ; j++){
                if(i==j) continue;
                min_x = Math.min(min_x, p[j][0]);
                min_y = Math.min(min_y, p[j][1]);
                max_x = Math.max(max_x, p[j][0]);
                max_y = Math.max(max_y, p[j][1]);
            }
            w = (max_x - min_x) * (max_y - min_y);
            ans = Math.min(ans, w);
        }

        System.out.println(ans);
    }
}