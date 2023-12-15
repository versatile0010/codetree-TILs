import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(stk.nextToken());
        int n2 = Integer.parseInt(stk.nextToken());

        String a = "";
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n1; i++){
            a += stk.nextToken();
        }
        String b = "";
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n2; i++){
            b += stk.nextToken();
        }
        System.out.println(f(a,b));
    }
    public static String f(String a, String b){
        return a.contains(b) ? "Yes" : "No";
    }
}