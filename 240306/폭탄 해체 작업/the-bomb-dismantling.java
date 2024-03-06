import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[n];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());
            nodes[i] = new Node(s, t);
        }
        Arrays.sort(nodes, (a, b) -> {
            if(a.time != b.time){
                return a.time - b.time;
            }
            return a.score - b.score;
        });
        int ans = 0;
        int idx = n-1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int t = 10000; t >= 1; t--){
            while(idx >= 0 && nodes[idx].time >= t){
                //System.out.println("t = " + t + "pq add " + nodes[idx].score);
                pq.add(-nodes[idx].score);
                idx--;
            }
            if(!pq.isEmpty()){
                //System.out.println(pq.peek());
                ans += -pq.poll();
            }
        }
        System.out.println(ans);
    }

    public static class Node {
        int score;
        int time;
        public Node (int score, int time){
            this.score =score;
            this.time = time;
        }
    }
}