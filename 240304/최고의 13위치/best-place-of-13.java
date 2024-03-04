import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        int [][] graph = new int[n][n];
        for(int i = 0 ;i< n ; i ++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n-2; j++){
                ans = Math.max(ans, graph[i][j] + graph[i][j+1] + graph[i][j+2]);
            }
        }
        System.out.println(ans);
    }
}