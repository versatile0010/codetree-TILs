import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node [] nodes = new Node[n];
        StringTokenizer stk;
        for(int i = 0 ;i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken());
            int e = Integer.parseInt(stk.nextToken());
            nodes[i] = new Node(s, e);
        }
        Arrays.sort(nodes);
        int prevEnd = nodes[0].e;
        int cnt = 1;
        for(int i = 1 ; i < n ; i ++){
            int s = nodes[i].s;
            int e = nodes[i].e;

            if(prevEnd <= s){
                cnt++;
                prevEnd = e;
            }
        }
        System.out.println(cnt);
    }
    public static class Node implements Comparable<Node>{
        int s;
        int e;
        public Node(int s, int e){
            this.s = s;
            this.e = e;
        }
        @Override
        public int compareTo(Node o){
            if (o.e >= this.e) {
                return -1;
            } 
            return 1;
        }
    }
}