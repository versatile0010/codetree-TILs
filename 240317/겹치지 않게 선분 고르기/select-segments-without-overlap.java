import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static Pair[] lines;
    static ArrayList<Pair> selected = new ArrayList<>();
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
            if(isPossible()){
                ans = Math.max(ans, selected.size());
            }
            return;
        } else {
            selected.add(lines[depth]);
            dfs(depth+1);
            selected.remove(selected.size() - 1);
            dfs(depth+1);
        }
    }

    public static boolean isPossible(){
        for(int i = 0 ; i < selected.size(); i++){
            for(int j = i+1; j < selected.size(); j++){
                if(isOverlapped(selected.get(i), selected.get(j))){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isOverlapped(Pair a, Pair b){
        return Math.max(a.x1, b.x1) <= Math.min(a.x2, b.x2);
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