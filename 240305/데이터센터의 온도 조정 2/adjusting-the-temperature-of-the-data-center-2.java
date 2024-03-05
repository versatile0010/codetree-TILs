import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        int g = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());

        int [][] t = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            t[i][0] = Integer.parseInt(stk.nextToken());
            t[i][1] = Integer.parseInt(stk.nextToken());
        }
        
        int ans = 0;
        for(int i = 0; i <= 1000; i++){
            int sum = 0;
            for(int j = 0; j < n ; j++){
                int Ta = t[j][0];
                int Tb = t[j][1];
                if(i < Ta) {
                    sum += c;
                }
                if(i >= Ta && i <= Tb){
                    sum += g;
                }
                if(i > Tb) {
                    sum += h;
                }
            }
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}