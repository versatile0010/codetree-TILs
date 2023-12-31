import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int [][] graph = new int[2001][2001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        for(int i = 0 ; i < 3; i++){
           StringTokenizer stk = new StringTokenizer(br.readLine());
           int x1 = Integer.parseInt(stk.nextToken()) + 1000;
           int y1 = Integer.parseInt(stk.nextToken()) + 1000;
           int x2 = Integer.parseInt(stk.nextToken()) + 1000;
           int y2 = Integer.parseInt(stk.nextToken()) + 1000;

           for(int j = y1; j < y2; j++){
              for(int k = x1; k < x2; k++){
                   if(i == 2){
                     graph[j][k] = 0;
                   } else {
                     graph[j][k] = 1;
                   }
                }
            }
        }
        int cnt = 0;
        for(int i = 0 ; i <= 2000; i++){
            for(int j = 0; j <= 2000; j++){
                if(graph[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}