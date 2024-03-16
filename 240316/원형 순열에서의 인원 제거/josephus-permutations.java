import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= n; i++){
            q.offer(i);
        }

        while(!q.isEmpty()){
            for(int i = 0 ; i < k - 1 ; i++){
                q.offer(q.poll());
            }
            System.out.print(q.poll()+" ");
        }
    }
}