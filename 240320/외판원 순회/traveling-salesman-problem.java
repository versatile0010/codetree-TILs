import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static boolean [] visited;
    public static int [] arr;
    public static int [][] graph;
    public static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        arr = new int[n-1];
        graph = new int[n][n];
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
        if(depth == n-1){
            ans = Math.min(ans, calc());
            return;
        }
        for(int i = 1 ; i < n ; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
    public static int calc(){
        if(graph[0][arr[0]] == 0) {
            return Integer.MAX_VALUE;
        }

        int ret = graph[0][arr[0]]; // 0 -> arr[0]
        int prev = arr[0];

        for(int i = 1 ; i < n-1 ; i++){  // arr[0] -> arr[1] -> arr[2] -> arr[n-2]
            if(graph[prev][arr[i]] == 0){
                return Integer.MAX_VALUE;
            }
            ret += graph[prev][arr[i]];
            prev = arr[i];
        }
        if(graph[arr[n-2]][0] == 0) {
            return Integer.MAX_VALUE;
        }
        ret += (graph[arr[n-2]][0]); // arr[n-2] -> 0
        return ret;
    }
}