import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int [][] graph = new int[2001][2001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 2; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + 1000;
            int y1 = Integer.parseInt(stk.nextToken()) + 1000;
            int x2 = Integer.parseInt(stk.nextToken()) + 1000;
            int y2 = Integer.parseInt(stk.nextToken()) + 1000;

            for(int j = y1; j < y2; j++){
                for(int k = x1; k < x2; k++){
                    graph[j][k] = (i==0) ? 1 : 0; 
                }
            }
        }

        boolean flag = false;
        int maxX = -1;
        int maxY = -1;
        int minX = 2001;
        int minY = 2001;
        for(int i = 0 ; i <=2000; i++){
            for(int j = 0 ; j <=2000; j++){
                if(graph[i][j]==0) continue;
                maxX = Math.max(maxX, j);
                maxY = Math.max(maxY, i);
                minX = Math.min(minX, j);
                minY = Math.min(minY, i);
                flag = true;
            }
        }

        int ans = (maxX - minX + 1) * (maxY - minY + 1);
        if(flag){
            System.out.println(ans);
        } else System.out.println(0);
    }
}