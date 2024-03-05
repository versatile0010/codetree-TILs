import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(stk.nextToken());
        int Y = Integer.parseInt(stk.nextToken());
        int cnt = 0;
        for(int i = X; i<=Y; i++){
            boolean flag = true;

            String str = String.valueOf(i);
            int l = 0;
            int r = str.length() - 1;
            
            while( l <= r ) {
                if(str.charAt(l++) != str.charAt(r--)) {
                    flag = false;
                    break;
                }
            }

            if(flag) cnt++;
        }
        System.out.println(cnt++);
    }
}