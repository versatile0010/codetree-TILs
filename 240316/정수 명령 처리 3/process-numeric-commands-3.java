import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        while(n -- > 0){
            String [] input = br.readLine().split(" ");
            String op = input[0];
            if("push_front".equals(op)){
                int x = Integer.parseInt(input[1]);
                dq.offerFirst(x);
            }
            if("push_back".equals(op)){
                int x = Integer.parseInt(input[1]);
                dq.offerLast(x);
            }
            if("pop_front".equals(op)){
                System.out.println(dq.pollFirst());
            }
            if("pop_back".equals(op)){
                System.out.println(dq.pollLast());
            }
            if("size".equals(op)){
                System.out.println(dq.size());
            }
            if("empty".equals(op)){
                if(dq.isEmpty()){
                    System.out.println(1);
                } else System.out.println(0);
            }
            if("front".equals(op)){
                System.out.println(dq.peekFirst());
            }
            if("back".equals(op)){
                System.out.println(dq.peekLast());
            }
        }
    }
}