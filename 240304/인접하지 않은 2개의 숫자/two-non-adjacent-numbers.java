import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 2; j < n ; j++){
                int t = a[i] + a[j];
                ans = Math.max(ans, t);
            }
        }
        System.out.println(ans);
    }
}