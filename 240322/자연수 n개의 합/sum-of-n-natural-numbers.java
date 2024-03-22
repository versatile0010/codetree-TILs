import java.io.*;
import java.util.*;

public class Main {
    public static long s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = Long.parseLong(br.readLine());
        System.out.println(f());
    }
    public static long f(){
        long l = 1;
        long r = (long)Math.sqrt(Math.pow(10, 18));
        long x = 0;
        while(l<=r){
            long mid = (l+r)/2;
            if(mid*(mid+1)/2 <= s){
                l = mid + 1;
                x = Math.max(x, mid);
            } else {
                r = mid - 1;
            }
        }
        return x;
    }
    
}