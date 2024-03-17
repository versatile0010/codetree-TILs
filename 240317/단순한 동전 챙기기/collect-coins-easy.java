import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static boolean [][] visited;
    public static int [][] dist;
    public static boolean [] used;
    public static ArrayList<Tuple> coins = new ArrayList<>();
    public static ArrayList<Tuple> selected = new ArrayList<>();
    public static int [] dx = {0, 0, -1, 1};
    public static int [] dy = {-1, 1, 0 ,0};
    public static Tuple s;
    public static Tuple e;
    public static int ans = Integer.MAX_VALUE;;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            String str = br.readLine();
            for(int j = 0 ; j < n ; j++){
                int c = str.charAt(j);
                if(c == 'S'){
                    s = new Tuple(j, i, 0);
                }
                else if(c == 'E') {
                    e = new Tuple(j, i, 0);
                }
                else if(c != '.') {
                    coins.add(new Tuple(j, i, c-'0'));
                }
            }
        }
        used = new boolean[coins.size()];
        Collections.sort(coins, (Tuple a, Tuple b) -> {
            return a.num - b.num;
        });

        //for(Tuple coin : coins){
            //System.out.println("x="+coin.x+" y="+coin.y+ " num=" + coin.num);
        //}
        dfs(0, 0);
        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
    
    public static void dfs(int depth, int start){
        if(depth >= 3){
            // 이동 횟수를 구해서 ans 를 갱신
            //for(Tuple coin : selected) {
            //    System.out.println("x="+coin.x+" y="+coin.y+ " num=" + coin.num);
            //}
            //System.out.println();
            //System.out.println("from(" + selected.get(0).x + "," + selected.get(0).y +") , to(" + selected.get(1).x + "," + selected.get(1).y + ")--->" + getDistance(selected.get(0), selected.get(1)));
            int total=0;
            for(int i = 0 ; i < selected.size() - 1; i++){
                total += getDistance(selected.get(i), selected.get(i+1));
            }
            total += (getDistance(s, selected.get(0)) + getDistance(selected.get(selected.size() - 1), e));

            ans = Math.min(total, ans);

            return;
        }
        // 조합을 찾자
        for(int i = start ; i < coins.size(); i++){
            if(!used[i]){
                used[i] = true;
                selected.add(coins.get(i));
                dfs(depth + 1, i + 1);
                used[i] = false;
                selected.remove(depth);
            }
        }
    }

    public static int getDistance(Tuple from, Tuple to){
        // from -> to 까지의 최단 거리를 구하자
        dist = new int[n][n];
        visited = new boolean[n][n];

        Queue<Tuple> q = new LinkedList<>();
        q.add(from);
        visited[from.y][from.x] = true;
        while(!q.isEmpty()){
            Tuple now = q.poll();
            if(now.x == to.x && now.y == to.y){
                break;
            }
            for(int dir = 0 ; dir < 4 ; dir ++){
                int nx = now.x + dx[dir];
                int ny = now.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(visited[ny][nx]) continue;
                dist[ny][nx] = dist[now.y][now.x] + 1;
                q.offer(new Tuple(nx, ny, 0));
                visited[ny][nx] = true;
            }
        }
        return dist[to.y][to.x];
    }

    public static class Tuple {
        int x;
        int y;
        int num;
        public Tuple(int x, int y, int num){
            this.x = x;
            this.y = y;
            this.num = num;
        }
    }
}