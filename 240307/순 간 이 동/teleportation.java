import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());

        /**
           1. A->B
           2. A->X->Y->B
           3. A->Y->X->B
        */

        int a2b = Math.abs(a-b);
        int a2xy2b = Math.abs(a-x) + Math.abs(y-b);
        int a2yx2b = Math.abs(a-y) + Math.abs(x-b);

        int ans = Math.min(a2b, Math.min(a2xy2b, a2yx2b));

        System.out.println(ans);
    }
}