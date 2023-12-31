import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int [][] graph = new int[201][201];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken()) + 100;
            int y = Integer.parseInt(stk.nextToken()) + 100;
            for(int j = y; j < y + 8; j++){
                for(int k = x; k < x + 8; k++){
                    graph[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0 ; i <= 200; i++){
            for(int j = 0 ; j <= 200; j++){
                if(graph[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}