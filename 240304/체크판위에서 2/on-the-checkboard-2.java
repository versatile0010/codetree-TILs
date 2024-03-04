import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        char [][] graph = new char[r][c];

        for(int i = 0 ; i < r ; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < c ; j++){
                graph[i][j] = stk.nextToken().charAt(0);
            }
        }

        int ans = 0 ;

        for(int i = 1; i < r; i++){
            for(int j = 1; j < c ; j++){
                for(int k = i+1; k < r-1; k ++){
                    for(int l = j+1; l < c-1 ; l++){
                        if(graph[0][0] != graph[i][j] && graph[i][j] != graph[k][l]
                                && graph[k][l] != graph[r-1][c-1]) {
                                    ans++;
                                }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}