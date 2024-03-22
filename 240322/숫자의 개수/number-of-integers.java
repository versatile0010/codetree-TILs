import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static long [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        arr = new long[n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Long.parseLong(stk.nextToken());
        }
        for(int i = 0 ; i < m ; i++){
            long x = Integer.parseInt(br.readLine());
            System.out.println(upperBound(x) - lowerBound(x));
        }
    }

    public static int lowerBound(long x){
        int l = 0;
        int r = n-1;
        int idx = n;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] >= x){
                r = mid - 1;
                idx = Math.min(idx, mid);
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }

    public static int upperBound(long x){
        int l = 0;
        int r = n-1;
        int idx = n;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > x){
                r = mid - 1;
                idx = Math.min(idx, mid);
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }
}