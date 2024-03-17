import java.io.*;
import java.util.*;

public class Main {
    
    public static int n;
    public static int m;
    public static int [] arr;
    public static boolean [] used;
    public static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        arr = new int[n];
        used = new boolean[n+1];

        dfs(0, 1);
        System.out.println(ans);
    }

    public static void dfs(int depth, int start){
        if(depth == m){
            // xor 계산 후 ans 갱신
            int calc = arr[0];
            if(m == 1) {
                calc = 0;
            } else {
                for(int i = 1 ; i < m; i++){
                    calc ^= arr[i];
                }
            }

            ans = Math.max(calc, ans);
            return;
        }
        for(int i = start; i <= n; i++){
            if(!used[i]){
                used[i] = true;
                arr[depth] = i;
                dfs(depth+1, start+1);
                used[i] = false;
            }
        }
    }
}