import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int [] arr = new int[n];
        for(int i = 0 ; i  < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            arr[i] = x;
            pq.add(x);
        }
        pq.poll();
        int second = pq.poll();
        if(!pq.isEmpty() && pq.peek() == second){
            System.out.println(-1);
        } else {
            for(int i = 0 ; i < n ; i++){
                if(second == arr[i]){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}