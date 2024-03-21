import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int k;
    public static int [][] graph;
    public static boolean [][] check;
    public static boolean [][] visited;
    public static int [] dx = new int [] {0, 0, -1, 1};
    public static int [] dy = new int [] {-1, 1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
         n = Integer.parseInt(stk.nextToken());
         k = Integer.parseInt(stk.nextToken());
         graph = new int[n][n];
         check = new boolean [n][n];

         for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
         }

         for(int i = 0 ; i < k ; i++){
            stk = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(stk.nextToken()) - 1;
            int x = Integer.parseInt(stk.nextToken()) - 1;
            visited = new boolean[n][n];
            bfs(x, y);
         }
         int cnt = 0;
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(graph[i][j] == 0 && check[i][j]) cnt++;
            }
         }
         System.out.println(cnt);
    }
    public static void bfs(int x, int y){
        visited[y][x] = true;
        check[y][x] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            for(int dir = 0 ; dir < 4 ;dir ++){
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(visited[ny][nx] || graph[ny][nx] == 1) continue;
                visited[ny][nx] = true;
                check[ny][nx] = true;
                q.offer(new Pair(nx, ny));
            }
        }
    }
    public static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}