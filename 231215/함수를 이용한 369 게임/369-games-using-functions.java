import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        System.out.println(f(a,b));
    }
    public static int f(int a, int b){
        int cnt = 0;
        for(int i = a ; i <=b; i++){
           if(is369(i) || i%3==0) cnt++;
        }
        return cnt;
    }
    public static boolean is369(int n){
        while(n > 0){
            int t = n%10;
            if(t==3 || t==6 || t ==9) return true;
            n /= 10;
        }
        return false;
    } 
}