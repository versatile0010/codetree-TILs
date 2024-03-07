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
        int ans = 0;
        if(a[0] + 1 == a[1] && a[1] + 1 == a[2]) {
            ans = 0;
        }
        else if((a[1] - a[0])%2 == 0 || (a[2] - a[1] % 2 == 0)) {
            ans = 2;
        } else {
            ans = 3;
        }
        System.out.println(ans);
    }
}