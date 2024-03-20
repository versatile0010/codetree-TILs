import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int [][] graph;
    public static boolean [][] visited;
    public static int maxK;
    public static int r;
    public static int [] dx = new int[] {0,0,-1,1};
    public static int [] dy = new int[] {-1,1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        graph = new int[n][m]; // n 이 세로

        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
                maxK = Math.max(maxK, graph[i][j]);
            }
        }
        int maxLabel = -1;
        int ans = 0;
        for(int k = 1; k <= maxK; k++){
            int label = 0;
            visited = new boolean[n][m];

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    if(!isPossible(j, i, k)) continue;
                    dfs(j, i, k);
                    label++;
                }
            }
            if(label > maxLabel) {
                maxLabel = label;
                ans = k;
            }
        }
        System.out.println(ans + " " + maxLabel);
    }
    public static boolean isPossible(int x, int y, int k){
        if(x < 0 || x >= m || y < 0 || y >= n) return false;
        if( visited[y][x] || graph[y][x] <= k) return false;
        return true;
    }
    public static void dfs(int x, int y, int k){
        for(int dir =  0 ; dir < 4 ; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(!isPossible(nx, ny, k)) continue;
            if(visited[ny][nx]) continue;
            visited[ny][nx] = true;
            dfs(nx, ny, k);
        }
    }
}