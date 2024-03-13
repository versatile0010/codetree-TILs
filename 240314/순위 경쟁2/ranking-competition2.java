import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n];
        int [] b = new int [n];

        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            String op = stk.nextToken();
            int score = Integer.parseInt(stk.nextToken());
            if("A".equals(op)){
                a[i] = i == 0 ? score : a[i-1] + score;
                b[i] = i == 0 ? 0 : b[i-1];
            } else {
                b[i] = i == 0 ? score : b[i-1] + score;
                a[i] = i == 0 ? 0 : a[i-1];
            }
        }
        int ans = n == 0 ? 0 : 1;
        for(int i = 1 ; i < n ; i++){
            if(
                (a[i-1] == b[i-1] && a[i] > b[i]) ||
                (a[i-1] == b[i-1] && a[i] < b[i]) ||
                (a[i-1] > b[i-1] && a[i] == b[i]) ||
                (a[i-1] > b[i-1] && a[i] < b[i]) ||
                (a[i-1] < b[i-1] && a[i] == b[i]) ||
                (a[i-1] < b[i-1] && a[i] > b[i])
            ) ans++;
        }
        System.out.println(ans);
    }
}