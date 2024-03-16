import java.io.*;
import java.util.*;

public class Main {

    public static int [] arr;
    public static int k;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        k = Integer.parseInt(stk.nextToken());
        n = Integer.parseInt(stk.nextToken());
        
        arr = new int[k];

        dfs(0);
    }
    public static void dfs(int depth){
        if(depth == n){
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        } else {
            for(int i = 1 ; i <= k; i++){
                arr[depth] = i;
                dfs(depth + 1);
            }
        }
    }
}