import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n+1];
        int [] b = new int [n+1];

        for(int i = 1 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            String op = stk.nextToken();
            int score = Integer.parseInt(stk.nextToken());
            if("A".equals(op)){
                a[i] = a[i-1] + score;
                b[i] = b[i-1];
            } else {
                b[i] = b[i-1] + score;
                a[i] = a[i-1];
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(
                (a[i] == b[i] && a[i+1] > b[i+1]) ||
                (a[i] == b[i] && a[i+1] < b[i+1]) ||
                (a[i] > b[i] && a[i+1] == b[i+1]) ||
                (a[i] > b[i] && a[i+1] < b[i+1]) ||
                (a[i] < b[i] && a[i+1] == b[i+1]) ||
                (a[i] < b[i] && a[i+1] > b[i+1])
            ) ans++;
        }
        System.out.println(ans);
    }
}