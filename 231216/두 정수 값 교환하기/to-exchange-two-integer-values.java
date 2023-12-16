import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        IntWrapper n = new IntWrapper(Integer.parseInt(stk.nextToken()));
        IntWrapper m = new IntWrapper(Integer.parseInt(stk.nextToken()));

        swap(n, m);

        System.out.println(n.value + " " + m.value);
    }

    public static void swap(IntWrapper n, IntWrapper m){
        int t = n.value;
        n.setValue(m.value);
        m.setValue(t);
    }

    public static class IntWrapper{
        int value;
        
        public IntWrapper(int value){
            this.value = value;
        }
        
        public void setValue(int value){
            this.value = value;
        }
    }
}