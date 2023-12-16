import java.io.*;
import java.util.*;

public class Main {
    static int [] p;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int [] a = new int[n];
        int [] p = new int[n+1];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }

        for(int i = 0 ; i < n ; i++){
            p[i+1] = p[i] + a[i];
        }

        for(int i = 0 ; i < m; i++){
            stk = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            System.out.println(p[end] - p[st-1]);
        }
    }
}