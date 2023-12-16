import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n+1];
        for(int i = 1; i <= n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
            if(i%2==1){
                Arrays.sort(a, 1, i+1);
                System.out.print(a[i/2+1]+" ");
            }
        }
    }
}