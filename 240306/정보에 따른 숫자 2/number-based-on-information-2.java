import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(stk.nextToken());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        char [] arr = new char[1001];

        for(int i = 0 ; i < T ; i ++){
            stk = new StringTokenizer(br.readLine());
            String c = stk.nextToken();
            int idx = Integer.parseInt(stk.nextToken());
            arr[idx] = c.charAt(0);
        }
        int cnt = 0;
        for(int i = a; i <= b ; i++){
            int minS = 1001;
            int minN = 1001;
            int diff = 1001;
            for(int j = 0; j <= 1000; j++){
                // i 와 가장 가까운 S 위치 구하기
                if(arr[j] == 'S' && Math.abs(i - j) <= diff){
                    minS = j;
                    diff = Math.abs(i - minS);
                }
            }
            diff = 1001;
            for(int j = 0; j <= 1000; j++){
                // i 와 가장 가까운 N 위치 구하기
                if(arr[j] == 'N' && Math.abs(i - j) <= diff) {
                    minN = j;
                    diff = Math.abs(i - minN);
                }
            }
            int d1 = Math.abs(i - minS);
            int d2 = Math.abs(i - minN);
            if(d1 <= d2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}