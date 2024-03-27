import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int m;
    public static int [] a;
    public static int [] b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        a = new int[1000*1000+1];
        b = new int[1000*1000+1];

        int at = 1;
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());

            String d = stk.nextToken();
            int x = Integer.parseInt(stk.nextToken());

            while(x-- > 0){
                if("R".equals(d)){
                    a[at] = a[at-1] + 1;
                } else {
                    a[at] = a[at-1] - 1;
                }
                at++;
            }
        }
        int bt = 1;
        for(int i = 0 ; i < m ; i++){
            stk = new StringTokenizer(br.readLine());
            String d = stk.nextToken();
            int x = Integer.parseInt(stk.nextToken());
            while(x-- > 0){
                if("R".equals(d)){
                    b[bt] = b[bt-1] + 1;
                } else {
                    b[bt] = b[bt-1] - 1;
                }
                bt++;
            }
        }    

        int ans = -1;
        for(int i = 1 ; i <= 1000; i++){
            if(a[i] == b[i]){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}