import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n ; k++){
                    if(a[i] <= a[j] && a[j] <= a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}