import java.io.*;
import java.util.*;

public class Main {
    public static char [][] graph = new char[10][10];
    public static int [][] dist = new int[10][10];

    public static int [] dx = new int[]{0,0,-1,1};
    public static int [] dy = new int[]{-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0; 
        int bx = 0;
        int by = 0;
        for(int i = 0 ; i < 10 ; i++){
            String input = br.readLine();
            for(int j = 0 ; j<10; j++){
                graph[i][j] = input.charAt(j);
                if('L' == input.charAt(j)){
                    x = j;
                    y = i;
                }
                if('B' == input.charAt(j)){
                    bx = j;
                    by = i;
                }
            }
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int dir = 0 ; dir < 4 ; dir ++){
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if(nx < 0 || nx >= 10 || ny < 0 || ny >= 10) continue;
                if(graph[ny][nx] == 'R') continue;
                if(dist[ny][nx] != 0) continue;

                dist[ny][nx] = dist[cur.y][cur.x] + 1;
                q.offer(new Node(nx, ny));
            }
        }
        System.out.println(dist[by][bx] - 1);
    }

    public static class Node {
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}