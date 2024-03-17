import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static ArrayList<Pair> bombCounts = new ArrayList<>();
    static int [][] bombTypes;
    static int [][] graph;
    static int ans = 0;
    static Pair [][] direction = {
        {new Pair(0, -2), new Pair(0, -1), new Pair(0, 0), new Pair(0, 1), new Pair(0, 2)},
        {new Pair(0, -1), new Pair(0, 0), new Pair(-1, 0), new Pair(1, 0), new Pair(0, 1)},
        {new Pair(-1, -1), new Pair(1, -1), new Pair(0, 0), new Pair(-1, 1), new Pair(1, 1)}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j ++){
                int x = Integer.parseInt(stk.nextToken());
                graph[i][j] = x;
                if(x == 1){
                    bombCounts.add(new Pair(j, i));
                }
            }
        }
        bombTypes = new int[n][n];
        find(0);
        System.out.println(ans);
    }

    public static void find(int depth){
        if(depth == bombCounts.size()){
            // 영역 계산 후 max 값 갱신
            ans = Math.max(ans, calculate());
            return;
        } else {
            for(int i = 0; i <= 2; i++){ // 폭탄은 0 ,1 ,2 타입만 존재
                int x = bombCounts.get(depth).x;
                int y = bombCounts.get(depth).y;

                bombTypes[y][x] = i;
                find(depth + 1);
                bombTypes[y][x] = 0;
            }
        }

    }

    public static int calculate(){
        int [][] temp = new int[n][n];
    
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(bombTypes[i][j] > 0){
                    int x = j;
                    int y = i;
                    int type = bombTypes[y][x];
                    for(int dir = 0 ; dir < direction[type].length; dir++){
                        int nx = x + direction[type][dir].x;
                        int ny = y + direction[type][dir].y;
                        if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                        temp[ny][nx] = 1;
                    }
                }
            }
        }
        int cnt = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                if(temp[i][j] == 1){
                    cnt++;
                }
            }
        }        
        return cnt;
    }

    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}