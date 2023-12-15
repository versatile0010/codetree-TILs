import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        String op = stk.nextToken();
        int b = Integer.parseInt(stk.nextToken());
        System.out.print(a + " " + op + " " + b + " = ");
        f(a,op,b);
    }
    public static void f(int a, String op, int b){
       switch (op){
        case "+": 
            System.out.println(a+b);
            break;
        case "-":
            System.out.println(a-b);
            break;
        case "*":
            System.out.println(a*b);
            break;
        case "/":
            System.out.println(a/b);
            break;
        default:
            System.out.println("False");
       }
    }
}