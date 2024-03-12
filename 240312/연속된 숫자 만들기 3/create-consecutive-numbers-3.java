import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[3];
        for(int i = 0 ; i < 3; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(a);
        
        if(a[0] + 1 == a[1] && a[1] + 1 == a[2]) {
            System.out.println(0);
        } else {
            int ans = Math.max(a[2] - a[1] - 1, a[1] - a[0] - 1);
            System.out.println(ans);
        }


    }
}