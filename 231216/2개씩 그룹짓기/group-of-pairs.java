import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n*2];
        for(int i = 0 ; i < 2*n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(a);
        int l = 0;
        int r = 2*n-1;
        int ans = -1;
        while(l < r){
            ans = Math.max(a[l] + a[r], ans);
            l++;
            r--;
        }
        System.out.println(ans);
    }
}