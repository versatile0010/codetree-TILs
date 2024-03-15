import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int [] arr = new int[n];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int idx = 0;
        int cnt = 0;
        while(idx < n - 1){
            if(arr[idx] == 1) {
                idx += m;
                cnt ++;
                idx += m;
            } else {
                idx++;
            }
        }
        System.out.println(cnt);
    }
}