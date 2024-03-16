import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            String [] input = br.readLine().split(" ");
            String op = input[0];
            if("push".equals(op)){
                int x = Integer.parseInt(input[1]);
                q.offer(x);
            }
            if("pop".equals(op)){
                System.out.println(q.poll());
            }
            if("size".equals(op)){
                System.out.println(q.size());
            }
            if("empty".equals(op)){
                if(q.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if("front".equals(op)){
                System.out.println(q.peek());
            }
        }
    }
}