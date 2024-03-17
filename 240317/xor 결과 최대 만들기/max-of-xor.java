import java.io.*;
import java.util.*;

public class Main {
    
    public static int n;
    public static int m;
    public static int [] arr;
    public static int [] base;
    public static boolean [] used;
    public static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        arr = new int[n];
        base = new int[n];
        used = new boolean[n+1];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            base[i] = Integer.parseInt(stk.nextToken());
        }

        dfs(0, 0);
        System.out.println(ans);
    }

    public static void dfs(int depth, int start){
        if(depth == m){
            // xor 계산 후 ans 갱신
            int calc = base[0];
            for(int i = 1 ; i < m; i++){
                calc ^= base[i];
            }
            ans = Math.max(calc, ans);
            return;
        }
        for(int i = start; i < n; i++){
            if(!used[i]){
                used[i] = true;
                arr[depth] = base[i];
                dfs(depth+1, start+1);
                used[i] = false;
            }
        }
    }
}