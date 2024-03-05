import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int ans = 0;
        for(int i = a; i<= b; i++){
            int x = i;
            int sum = 0;
            while(x > 0){
                sum += x%10;
                x/=10;
            }
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}