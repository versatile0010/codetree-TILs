import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int [] a = new int [n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int [] b = new int[m];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            b[i] = Integer.parseInt(stk.nextToken());
        }       

        Arrays.sort(b);
        int cnt = 0;
        for(int i = 0 ; i + m <= n ; i++){
            int [] t = new int [m];
            int idx = 0;
            
            for(int j = i; j < i+m; j++){
                t[idx++] = a[j];
            }

            Arrays.sort(t);
            boolean flag = true;
            for(int j = 0; j < m; j++){
                if(t[j] != b[j]) flag = false;
            }
            if(flag) cnt++;
        }
        System.out.println(cnt);
    }
}