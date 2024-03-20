import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] graph;
    public static boolean [] visited;
    public static int n;
    public static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        visited = new boolean[n+1];
        graph = new ArrayList[n+1];
        for(int i = 1 ; i <=n; i++){
            graph[i] = new ArrayList<>();
        }
        m = Integer.parseInt(stk.nextToken());
        for(int i = 0 ; i < m ; i ++){
            stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken());
            int e = Integer.parseInt(stk.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }
        dfs(1);
        int cnt  =0;
        for(int i = 2 ; i<=n; i++){
            if(visited[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void dfs(int v){
        for(int i = 0; i < graph[v].size(); i++){
            int cur = graph[v].get(i);
            if(!visited[cur]){
                visited[cur] = true;
                dfs(cur);
            }
        }
    }
}