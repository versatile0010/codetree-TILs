import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int k;
    public static int [][] graph;
    public static boolean [][] visited;
    public static int [] dx = new int [] {0, 0, -1, 1};
    public static int [] dy = new int [] {-1, 1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());
        graph = new int[n][n];
        visited = new boolean[n][n];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        stk = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(stk.nextToken()) - 1;
        int x = Integer.parseInt(stk.nextToken()) - 1;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        visited[y][x] = true;
        int ansX = x;
        int ansY = y;
        for(int i = 0 ; i < k ; i++){
            Pair cur = q.poll();
            PriorityQueue<Tuple> pq = new PriorityQueue<>();
            for(int dir = 0 ; dir < 4 ; dir ++){
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(visited[ny][nx] || graph[ny][nx] > graph[y][x] ) continue;
                pq.offer(new Tuple(nx, ny, graph[ny][nx]));
            }
            if(pq.isEmpty()){
                break;
            }                
            Tuple tuple = pq.peek();
            visited[tuple.y][tuple.x] = true;
            q.add(new Pair(tuple.x, tuple.y));
            ansX = tuple.x;
            ansY = tuple.y;
            //System.out.println("("+ tuple.x + ", " + tuple.y + ")");
        }

        System.out.println((ansY+1)+" "+(ansX+1));

    }
    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static class Tuple implements Comparable<Tuple> {
        int x;
        int y;
        int num;

        public Tuple(int x, int y, int num){
            this.x =x;
            this.y =y;
            this.num = num;
        }

        @Override
        public int compareTo(Tuple o){
            if(this.num == o.num){
                if(this.y != o.y){
                    return this.y - o.y;
                }
                else if(this.x != o.x) {
                    return this.x - o.x;
                }
            }
            return -(this.num - o.num);
        }
    }
}