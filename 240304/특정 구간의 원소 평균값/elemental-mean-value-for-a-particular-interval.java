import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] a = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        int cnt = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = i; j < n ; j++){
                if(i==j) {
                    cnt++;
                    continue;
                }
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += a[k];
                }
                double avg = (double)sum/(j-i+1);
                for(int k = i; k <=j; k++){
                    if(avg == a[k]){
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}