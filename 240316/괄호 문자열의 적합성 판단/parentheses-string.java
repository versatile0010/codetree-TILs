import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < input.length(); i++){
            char cur = input.charAt(i);
            if(st.isEmpty()){
                st.push(cur);
                continue;
            }
            if(cur == '('){
                st.push(cur);
                continue;
            }
            if(cur == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }
        }
        if(st.size() > 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}