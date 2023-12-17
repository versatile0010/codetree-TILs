import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());


        int ans = (a-11)*24*60 + (b-11)*60 + (c-11);
        if (ans < 0) {
            ans = -1;    
        }
        System.out.println(ans);
    }
}