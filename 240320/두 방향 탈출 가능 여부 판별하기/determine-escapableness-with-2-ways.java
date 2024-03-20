import java.io.*;
import java.util.*;

public class Main {
    public static int [] dx = new int []{0, 1};
    public static int [] dy = new int []{1, 0};
    public static int [][] graph;
    public static boolean [][] visited;
    public static int n;
    public static int m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ; i < n; i ++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        visited[0][0] = true;
        dfs(0, 0);
        int ans = visited[m-1][m-1] ? 1 : 0;
        System.out.println(ans);
    }
    public static void dfs(int x, int y){
        for(int dir = 0 ; dir<2; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if(visited[ny][nx] || graph[ny][nx] == 0) continue; // 0 인 경우가 뱀
            visited[ny][nx] = true;
            dfs(nx, ny);
        }
    }
}