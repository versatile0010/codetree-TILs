import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[2*n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 2*n ; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int diff = Math.abs(arr[i] - arr[n+i]);
            ans = Math.min(diff, ans);
        }
        System.out.println(ans);
    }
}