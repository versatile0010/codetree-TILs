import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }

        int mini = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int x = 0;
            for(int j = 0 ; j < n ; j++){
                x += Math.abs(i - j) * a[j];
            }
            if ( x <= mini ) {
                mini = x;
            }
        }
        System.out.println(mini);
    }
}