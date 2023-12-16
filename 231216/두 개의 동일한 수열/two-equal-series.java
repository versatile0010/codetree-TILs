import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] b = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            b[i] = Integer.parseInt(stk.nextToken());
        }        

        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0 ; i < n ; i++){
            if(a[i]!=b[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}