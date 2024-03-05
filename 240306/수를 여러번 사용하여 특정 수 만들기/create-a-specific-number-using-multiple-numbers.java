import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        int ans = 0;
        for(int i = 0 ; i * a <= c; i++) {
            int sum = a*i;
            int nb = (c - sum) / b;

            sum += nb * b;

            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}