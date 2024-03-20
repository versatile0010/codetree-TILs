import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int [][] graph;
    public static boolean [][] visited;
    public static int [] dx = new int [] {0,0,-1,1};
    public static int [] dy = new int [] {-1,1,0,0};
    public static int p;
    public static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];

        StringTokenizer stk;
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(isPossible(j, i)) {
                    visited[i][j] = true;
                    p = 1;
                    dfs(j, i);
                    ans.add(p);
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans.size());
        for(int ele : ans){
            System.out.println(ele);
        }
    }
    public static boolean isPossible(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= n) return false;
        if(visited[y][x] || graph[y][x] == 0) return false;
        return true;
    }
    public static void dfs(int x, int y){
        for(int dir = 0 ; dir< 4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(!isPossible(nx, ny)) continue;
            visited[ny][nx] = true;
            p++;
            dfs(nx, ny);
        }
    }
}