import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static Pair[] lines;
    static int ans;
    static int [] choice;
    static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        n = Integer.parseInt(br.readLine());
        choice = new int[n];
        lines = new Pair[n];
        visited = new boolean[n];
        for(int i = 0 ; i < n; i++){
            stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            lines[i] = new Pair(x1, x2);
        }
        dfs(0);
        System.out.println(ans);
    }
    public static void dfs(int depth){
        if(depth == n){
            // 선택한 n 개의 선분으로 뽑을 수 있는 최대 선분의 수를 구한다.
            Pair[] pairs = new Pair[n];
            for(int i = 0 ; i < n; i++){
                pairs[i] = lines[i];
            }
            Arrays.sort(pairs, (Pair a, Pair b)-> {
                return a.x2 - b.x2;
            });
            int cnt = 1;
            Pair prev = pairs[0];
            for(int i = 1 ; i < n ; i++){
                if(pairs[i].x1 > prev.x2){
                    cnt++;
                    prev = pairs[i];
                }
            }
            ans = Math.max(ans, cnt);
            return;
        } else {
            for(int i = 0 ; i < n ; i++){
                if(!visited[i]){
                    visited[i] = true;
                    choice[depth] = i;
                    dfs(depth+1);
                    visited[i] = false;
                }
            }
        }
    }

    public static class Pair{
        int x1;
        int x2;
        public Pair(int x1, int x2){
            this.x1=x1;
            this.x2=x2;
        }
    }
}