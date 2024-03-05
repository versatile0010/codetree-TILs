import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i++){
            // 2 배로 할 숫자 선택
            a[i] *= 2;
            for(int j = 0 ; j < n ; j++){
                // 제외할 숫자를 선택
                int [] t = new int[n-1];
                int idx = 0;
                for(int k = 0; k < n ; k++){
                    if(k == j) continue;
                    t[idx++] = a[k];
                }
                // 인접한 숫자 간 차이의 합을 구하자
                int sum = 0;
                for(int k = 1; k < n-1; k++){
                    sum += Math.abs(t[k-1]-t[k]);
                }
                ans = Math.min(sum, ans);
            }
            a[i] /= 2;
        }
        System.out.println(ans);
    }
}