import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static boolean [] visited;
    public static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        arr = new int[n];
        dfs(0);
    }
    public static void dfs(int depth){
        if(depth == n){
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]+" ");
            } System.out.println();
            return;
        }
        for(int i = n ; i >= 1; i--){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}