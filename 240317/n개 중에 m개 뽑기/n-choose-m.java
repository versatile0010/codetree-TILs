import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int m;
    public static int [] arr;
    public static boolean [] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        arr = new int[n];
        used = new boolean[n+1];
        dfs(0, 1); // 1~n 중 m 개를 선택한다.
    }
    public static void dfs(int depth, int start){
        if(depth == m){
            for(int i = 0 ; i < m ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i <=n ; i++){
            if(!used[i]){
                used[i] = true;
                arr[depth] = i;
                dfs(depth+1, i+1);
                used[i] = false;
            }
        }
    }
}