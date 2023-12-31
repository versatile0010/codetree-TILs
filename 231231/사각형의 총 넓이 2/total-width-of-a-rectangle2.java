import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] graph = new int[201][201];

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + 100;
            int y1 = Integer.parseInt(stk.nextToken()) + 100;
            int x2 = Integer.parseInt(stk.nextToken()) + 100;
            int y2 = Integer.parseInt(stk.nextToken()) + 100;

            for(int j = y1; j < y2; j++){
                for(int k = x1; k < x2; k++){
                    graph[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0 ; i <= 200; i++){
            for(int j = 0 ; j <=200; j++){
                if(graph[i][j]==1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}