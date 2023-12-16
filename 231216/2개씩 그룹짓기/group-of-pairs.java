import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n*2];
        for(int i = 0 ; i < 2*n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(a);
        System.out.println(a[n-1] + a[n]);
    }
}