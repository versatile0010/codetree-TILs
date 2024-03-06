import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int [] coins = new int[n];
        for(int i = 0 ; i < n ; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for(int i = n-1; i >= 0 ; i--){
            if(k == 0) break;
            cnt += k / coins[i];
            k %= coins[i];
        }
        System.out.println(cnt);
    }
}