import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        int ans = -1;
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0 ; i < n; i++){
            cnt++;
            if(i==0 || arr[i] != arr[i-1]){
                ans = Math.max(ans, cnt);
            }
        }
        System.out.println(ans);
    }
}