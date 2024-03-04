import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] graph = new int[n][n];
        StringTokenizer stk;
        
        for(int i = 0 ; i < n ;  i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if(i > n - 3 || j > n-3) continue;

                int t = 0;
                for(int y = i; y < i+3; y++){
                    for(int x = j; x < j+3; x++){
                        t += graph[y][x];
                    }
                }
                ans = Math.max(ans, t);
            }
        }
        System.out.println(ans);
    }
}