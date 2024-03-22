import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int INF = (int)1e9;
    public static ArrayList<Node> [] graph;
    public static boolean visited [];
    public static int [] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        graph = new ArrayList[n+1];
        for(int i = 1 ; i<=n ; i++){
            graph[i] = new ArrayList<>();
        }
        dist = new int[n+1];
        visited = new boolean[n+1];
        for(int i = 0 ; i < m ; i++){
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            graph[y].add(new Node(x, w));
            graph[x].add(new Node(y, w));
        }
        stk = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(stk.nextToken());
        int e = Integer.parseInt(stk.nextToken());
        dijkstra(e, s); // 도착점까지의 각 노드의 최단거리를 계산한다.
        System.out.println(dist[s]);
        // 이제 최단 경로를 출력하자.
        int now = s;
        System.out.print(now+" ");
        while(now != e){
            for(int i = 0 ; i < graph[now].size(); i++){
                Node cur = graph[now].get(i);
                if(dist[now] == dist[cur.to] + cur.w){
                    now = cur.to;
                    break;
                }
            }
            System.out.print(now+" ");
            
        }
    }
    public static void dijkstra(int s, int e){
        Arrays.fill(dist, INF);
        dist[s] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        while(!pq.isEmpty()){
            Node now = pq.poll();
            if(visited[now.to]) continue;
            visited[now.to] = true;
            for(Node cur : graph[now.to]){
                if(dist[cur.to] > dist[now.to] + cur.w){
                    dist[cur.to] = dist[now.to] + cur.w;
                    pq.offer(new Node(cur.to, dist[cur.to]));
                }
            }
        }
    }
    public static class Node implements Comparable<Node> {
        int to;
        int w;
        public Node(int to, int w){
            this.to = to;
            this.w = w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
}