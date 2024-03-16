import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int arr[];
    public static int cnt;

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        dfs(0);
        System.out.println(cnt);
    }
    public static void dfs(int depth){
        // n 자리 수를 완전 탐색
        if(depth == n){
            // 아름다운 수 인지 판단
            if(isGood(arr)){
                cnt++;
            }
            return;
        } else {
            for(int i = 1; i <= 4; i++){
                arr[depth] = i;
                dfs(depth + 1);
            }
        }

    }
    public static boolean isGood(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i+=arr[i]){
            if(i+arr[i] - 1 >= n) {
                return false;
            }
            for(int j = i; j < i + arr[i]; j++){
                if(arr[j] != arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}