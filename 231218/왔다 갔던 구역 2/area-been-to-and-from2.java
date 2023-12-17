import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        int [] arr = new int [2001];
        int [] st = new int[n];
        int [] end = new int[n];

        int cur = 1000;
        for(int i = 0 ; i < n ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            String op = stk.nextToken();
            
            if("R".equals(op)){
                st[i] = cur;
                end[i] = cur+x;
                cur += x;
            } else {
                st[i] = cur-x;
                end[i] = cur;
                cur -= x;
            }
            st[i] += 1000;
            end[i] += 1000;
        }
        for(int i = 0; i < n; i++){
            for(int j = st[i]; j < end[i]; j++){
                arr[j]++;
            }
        }
        int cnt = 0;
        for(int i = 0 ; i <= 2000; i++){
            if(arr[i]>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}