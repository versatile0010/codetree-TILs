import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int cnt = 0 ;
        for(int i = a ; i<=b ; i++){
            if(f(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean f(int n){
        if(n%2 == 0) return false;
        if(n%10 == 5) return false;;
        if(n%3 ==0 && n%9 != 0) return false;
        return true;
    }
}