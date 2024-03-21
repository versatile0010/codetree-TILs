import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static boolean [][] visited;
    public static int [][] graph;
    public static int [] dx = new int [] {0,0,-1,1};
    public static int [] dy = new int [] {-1,1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        bfs(0, 0);
        int ans = visited[n-1][m-1] ? 1 : 0;
        System.out.println(ans);
    }
    public static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        visited[y][x] = true;
        while(!q.isEmpty()){
            Pair cur = q.poll();
            for(int dir = 0 ; dir < 4 ; dir++){
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if(visited[ny][nx] || graph[ny][nx] == 0) continue;
                visited[ny][nx] = true;
                q.offer(new Pair(nx, ny));
            }
        }
    }

    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}