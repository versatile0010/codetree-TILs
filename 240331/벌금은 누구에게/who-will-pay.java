import java.io.*;
import java.util.*;

public class Main {

    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());

        int ans = -1;
        int [] arr = new int [n];
        for(int i = 0 ; i < m ; i++){
            int t = Integer.parseInt(br.readLine());
            arr[t-1]++;
            if(arr[t-1] == k){
                ans = t;
            }
        }
        System.out.println(ans);
    }
}