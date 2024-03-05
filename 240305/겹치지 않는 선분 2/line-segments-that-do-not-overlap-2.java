import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int [n][2] ;
        StringTokenizer stk;
        for(int i = 0 ; i < n ; i++){
             stk = new StringTokenizer(br.readLine());
             arr[i][0] = Integer.parseInt(stk.nextToken());
             arr[i][1] = Integer.parseInt(stk.nextToken());
        }
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            boolean flag = false;
            for(int j = 0; j < n ; j++){
                if(i==j) continue;

                int x1 = arr[i][0];
                int x2 = arr[i][1];

                int xx1 = arr[j][0];
                int xx2 = arr[j][1];
                if((x1 <= xx1 && x2 >= xx2) || (x1 >= xx1 && x2 <= xx2)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}