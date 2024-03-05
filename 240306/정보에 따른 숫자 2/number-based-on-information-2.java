import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(stk.nextToken());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        int [] s = new int[1001];
        int [] n = new int[1001];

        int sIdx = 0;
        int nIdx = 0;

        for(int i = 0 ; i < T ; i ++){
            stk = new StringTokenizer(br.readLine());
            String c = stk.nextToken();
            int pos = Integer.parseInt(stk.nextToken());
            
            if("S".equals(c)){
                s[sIdx++] = pos;
            } else {
                n[nIdx++] = pos;
            }

        }
        int cnt = 0;
        for(int i = a; i <= b ; i++){
            int d1 = Integer.MAX_VALUE;
            for(int j = 0; j < sIdx; j++){
                d1 = Math.min(d1, Math.abs(i - s[j]));
            }
            int d2 = Integer.MAX_VALUE;
            for(int j = 0 ; j < nIdx; j++){
                d2 = Math.min(d2, Math.abs(i - n[j]));
            }
            if(d1 <= d2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}