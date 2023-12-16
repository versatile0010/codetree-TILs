import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n];

        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }

        f(a);
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void f(int [] a){
        for(int i = 0 ; i < a.length; i++){
            a[i] = Math.abs(a[i]);
        }
    }
}