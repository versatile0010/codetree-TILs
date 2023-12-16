import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int [] a = new int[n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
             a[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
}