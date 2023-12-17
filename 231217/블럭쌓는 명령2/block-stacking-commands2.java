import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken()); // 블록의 칸 수
        int k = Integer.parseInt(stk.nextToken()); // 명령의 개수
        int [] a = new int[n+1];
        int maxi = -1;
        for(int i = 0 ; i < k ; i++){
            stk = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            for(int j = st ; j <= end; j++){
                a[j]++;
                maxi = Math.max(maxi, a[j]);
            }
        }
        System.out.println(maxi);
    }
}