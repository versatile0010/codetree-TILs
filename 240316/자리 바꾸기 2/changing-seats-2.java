import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int [] arr = new int[n+1];
        for(int i = 1 ; i <=n; i++){
            arr[i] = i;
        }

        Node [] nodes = new Node[k];
        for(int i = 0 ; i < k; i ++){
            stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            nodes[i] = new Node(a, b);
        }
        List<Set<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <=n; i++){
            graph.add(new HashSet<Integer>());
        }

        for(int i = 0 ; i < k*3; i++){
            Node node = nodes[i%k];
            int x = node.x;
            int y = node.y;
            // x 와 y 의 자리를 바꾼다.
            int a = arr[x];
            int b = arr[y];

            graph.get(a).add(y);
            graph.get(b).add(x);

            arr[x] = b;
            arr[y] = a;
        }
        for(int i = 1; i<=n; i++){
            if(graph.get(i).size()==0){
                System.out.println(1);
            } else {
                System.out.println(graph.get(i).size());
            }
        }
    }
    public static class Node {
        int x;
        int y;
        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}