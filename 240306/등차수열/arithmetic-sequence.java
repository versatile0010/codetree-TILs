import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int k = 1 ; k <= 100; k++){
            ans = Math.max(ans,  f(arr, k));
        }
        System.out.println(ans);
    }
    public static int f(int [] arr, int k){
        int ret = 0;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == 2*k){
                    ret++;
                }
            }
        }
        return ret;
    }
}