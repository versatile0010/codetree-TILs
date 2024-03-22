import java.io.*;
import java.util.*;

public class Main {
    public static int n,m;
    public static ArrayList<Node>[] graph;
    public static int [] dist;
    public static int INF = (int)1e9;
    public static int [] path;
    public static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        graph = new ArrayList[n+1];
        dist = new int[n+1];
        path = new int[n+1];
        visited = new boolean[n+1];
        for(int i = 1 ; i<=n ;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < m ; i++){
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            graph[x].add(new Node(y, w));
            graph[y].add(new Node(x, w));
        }
        stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        // a -> b
        dijkstra(a, b);
        System.out.println(dist[b]);

        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = search(a, b);
        while(!stack.isEmpty()){
            sb.append(stack.pop()+" ");
        }
        System.out.println(sb.toString());
    }
    
    public static void dijkstra(int s, int e){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        Arrays.fill(dist, INF);
        dist[s] = 0;
        
        while(!pq.isEmpty()){
            Node now = pq.poll();

            for(Node cur : graph[now.to]){
                if(dist[cur.to] > dist[now.to] + cur.w){
                    dist[cur.to] = dist[now.to] + cur.w;
                    pq.offer(new Node(cur.to, dist[cur.to]));
                    // path
                    path[cur.to] = now.to;
                }
            }
        }
    }
    public static Stack<Integer> search(int start, int end){
        Stack<Integer> stack = new Stack<>();
        int cur = end;
        while(cur != start) {
            stack.push(cur);
            cur = path[cur];
        }
        stack.push(cur);
        return stack;

    }
    public static class Node implements Comparable<Node>{
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