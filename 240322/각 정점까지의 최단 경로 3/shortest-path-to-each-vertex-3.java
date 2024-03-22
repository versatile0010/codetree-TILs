import java.io.*;
import java.util.*;

public class Main {
    public static int n,m;
    public static ArrayList<Node>[] graph;
    public static int dist [];
    public static int inf = (int)1e9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        graph = new ArrayList[n+1];
        dist = new int[n+1];

        for(int i = 1 ; i <=n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < m ; i++){
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            graph[x].add(new Node(y, w));
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0));

        Arrays.fill(dist, inf);
        dist[1] = 0;
        while(!pq.isEmpty()){
            Node now = pq.poll();
            for(Node cur : graph[now.to]){
                if(dist[cur.to] > dist[now.to] + cur.w){
                    dist[cur.to] = dist[now.to] + cur.w;
                    pq.offer(new Node(cur.to, dist[cur.to]));
                }
            }
        }
        for(int i = 2; i <=n; i++){
            if(dist[i] == inf){
                System.out.println(-1);
            } else {
                System.out.println(dist[i]);
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