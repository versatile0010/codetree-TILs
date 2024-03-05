import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        int [][] arr = new int [N][3];
        for(int i = 0 ; i < N ; i++){
            stk = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(stk.nextToken());
            arr[i][1] = Integer.parseInt(stk.nextToken());
            arr[i][2] = Integer.parseInt(stk.nextToken());
        }
        int ans = 0;
        for(int i = 1; i <= 3; i++){
            int score = 0;
            int [] tArr = new int [4];
            tArr[i] = 1;
            for(int j = 0 ; j < N; j++){
                int a = arr[j][0];
                int b = arr[j][1];
                int c = arr[j][2];

                // swap
                int temp = tArr[a];
                tArr[a] = tArr[b];
                tArr[b] = temp;

                // open
                if(tArr[c] == 1){
                    score++;
                }
            }
            ans = Math.max(ans, score);
        }
        System.out.println(ans);
    }
}