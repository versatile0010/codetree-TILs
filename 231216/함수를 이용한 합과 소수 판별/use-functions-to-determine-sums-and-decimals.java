import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int cnt = 0;
        for(int i = a; i<=b ; i++){
            if(isPrime(i) && allEvens(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i = 2; i < n ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean allEvens(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum % 2 == 0 ? true : false;
    }
}