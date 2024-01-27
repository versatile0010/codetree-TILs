import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int [] da = new int [1000*1000*2+1];
        int [] db= new int [1000*1000*2+1];

        int curA = 1000*1000;
        int curB = 1000*1000;
        int ta = 0;
        int tb = 0;
        int j = 0;
        for(int i = 0 ; i < n + m ; i++){
            stk = new StringTokenizer(br.readLine());
            String op = stk.nextToken();
            int x = Integer.parseInt(stk.nextToken());

            if("R".equals(op)){
                if(i < n) {
                    for(j = curA; j <= curA + x; j++){
                        da[j] = ta++;
                    }
                    curA = j;
                } else {
                    for(j = curB; j <= curB + x; j++){
                        db[j] = tb++;
                    }
                    curB = j;
                }
            } else {
                if(i < n) {
                    for(j = curA; j >= curA - x; j--){
                        da[j] = ta++;
                    }
                    curA = j;
                } else {
                    for(j = curB; j >= curB - x ; j--){
                        db[j] = tb++;
                    }
                    curB = j;
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= 1000*1000*2; i++){
            if(da[i] == db[i]){
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }
}