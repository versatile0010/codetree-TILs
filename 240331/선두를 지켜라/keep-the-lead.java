import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
         n = Integer.parseInt(stk.nextToken());
         m = Integer.parseInt(stk.nextToken());
         int [] a = new int [1000*1000+1];
         int [] b = new int [1000*1000+1];
         int aidx = 1;
         for(int i = 0 ; i <  n ; i ++){
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());
            while(t-- > 0){
                a[aidx] = v + a[aidx - 1];
                aidx++;
            }
         }
         int bidx = 1;
         for(int i = 0 ; i < m; i++){
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());  
            while(t-- > 0){
                b[bidx] = v + b[bidx-1];
                bidx++;
            }
         }
         int prev = getStatus(a[1], b[1]);
         int cnt = 0;
         for(int i = 2 ; i < aidx; i++){
            //System.out.println(i+ "===> "+a[i]+", "+b[i]);
            if(prev != getStatus(a[i], b[i])){
                cnt++;
                //System.out.println("---------");
                prev = getStatus(a[i], b[i]);
            }
         }
         System.out.println(cnt);
    }
    public static int getStatus(int a, int b){
        return a > b ? 1 : 0;
    }
}