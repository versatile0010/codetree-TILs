import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        int ans = -1;
        for(int i = 0; i < n ; i++){
            if(i==0 || arr[i] > arr[i-1]){
                cnt++;
                ans = Math.max(cnt, ans);
            } else {
                cnt = 1;
            }
        }
        System.out.println(ans);
    }
}