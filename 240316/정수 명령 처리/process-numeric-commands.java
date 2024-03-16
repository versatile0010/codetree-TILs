import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(n-- >0) {
            String input = br.readLine();
            String [] str = input.split(" ");
            String op = str[0];
            if( str.length > 1) {
                int x = Integer.parseInt(str[1]);
                if("push".equals(op)){
                    stack.push(x);
                }
            } else {
                if("pop".equals(op)){
                    int t = stack.pop();
                    sb.append(t+"\n");
                }
                if("size".equals(op)){
                    sb.append(stack.size() + "\n");
                }
                if("empty".equals(op)){
                    if(stack.empty()){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                }
                if("top".equals(op)){
                    sb.append(stack.peek()+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}