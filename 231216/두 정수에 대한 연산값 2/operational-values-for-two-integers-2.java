import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        IntWrapper a = new IntWrapper(Integer.parseInt(stk.nextToken()));
        IntWrapper b = new IntWrapper(Integer.parseInt(stk.nextToken()));

        f(a,b);
        System.out.println(a.value+" "+b.value);
    }
    public static void f(IntWrapper a, IntWrapper b){
        if(b.value > a.value){
            f(b, a);
            return;
        }
        a.setValue(a.value*2);
        b.setValue(b.value+10);
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