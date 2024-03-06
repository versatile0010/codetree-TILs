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
            if(a.time == b.time){
                return b.score - a.score ;
            }
            return a.time - b.time;
        });
        int prevTime = -1;
        int ans = 0;
        for(Node node : nodes){
            if(prevTime == -1){
                prevTime = node.time;
                ans += node.score;
                continue;
            }
            if(prevTime < node.time){
                ans += node.score;
                prevTime = node.time;
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