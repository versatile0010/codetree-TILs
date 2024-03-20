import java.io.*;
import java.util.*;

public class Main {
    
    public static int n;
    public static boolean [] visited;
    public static int [] arr;
    public static int [][] graph;
    public static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        graph = new int [n][n];
        visited = new boolean[n];
        arr = new int[n];

        StringTokenizer stk;
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        dfs(0);
        System.out.println(ans);
    }
    public static void dfs(int depth){
        if(depth == n){
            ans = Math.max(ans, calc());
            return;
        }
        for(int i = 0 ; i < n ; i ++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
    public static int calc(){
        int ret = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            ret = Math.min(ret, graph[i][arr[i]]);
        }
        return ret;
    }
}