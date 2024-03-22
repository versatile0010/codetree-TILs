import java.io.*;
import java.util.*;

public class Main {
    public static long m;
    public static int a,b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        m = Long.parseLong(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        a = Integer.parseInt(stk.nextToken());
        b = Integer.parseInt(stk.nextToken());
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int x = a; x <= b; x++){
            int cnt = binarySearch(x);
            mini = Math.min(cnt, mini);
            maxi = Math.max(cnt, maxi);
        }
        System.out.println(mini + " " + maxi);
    }
    public static int binarySearch(long x){
        long l = 1;
        long r = m;
        int cnt = 0;
        while(l<=r){
            cnt++;
            long mid = (l+r)/2;
            if(mid == x){
                return cnt;
            } else if(mid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}