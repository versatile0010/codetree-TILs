import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        Node[] nodes = new Node[n];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(stk.nextToken());
            int v = Integer.parseInt(stk.nextToken());
            nodes[i] = new Node(w, v);
        }
        double ans = 0;
        Arrays.sort(nodes);
        for(int i = 0 ; i < n ; i++){
            int w = nodes[i].w;
            int v = nodes[i].v;
            if(m >= w) {
                m -= w;
                ans += v;
            } else {
                ans += (double)m / w * v;
                break;
            }            
        }
        System.out.printf("%.3f",ans);
    }
    public static class Node implements Comparable<Node> {
        int w;
        int v;

        public Node(int w, int v){
            this.w = w;
            this.v = v;
        }
        @Override
        public int compareTo(Node o){
            double x =  (double)o.v/o.w - (double)this.v/this.w;
            if (x<0){
                return -1;
            } else if(x==0) {
                return 0;
            } else return 1;
        }
    }
}