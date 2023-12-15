import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        int ret = 0;
        for(int i = a ; i <= b; i++){
            if(isPrime(i)){
                ret += i;
            }
        }
        System.out.println(ret);
    }
    public static boolean isPrime(int n){
        for(int i = 3 ; i < n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}