import java.io.*;
import java.util.*;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            pq.add(x);
        }
        int ans = 0;
        while(pq.size() > 1){
            int x1 = pq.poll();
            int x2 = pq.poll();
            pq.add(x1+x2);
            ans += (x1+x2);
        }
        System.out.println(ans);
    }
}