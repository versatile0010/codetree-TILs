import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int m1 = Integer.parseInt(stk.nextToken());
        int d1 = Integer.parseInt(stk.nextToken());
        int m2 = Integer.parseInt(stk.nextToken());
        int d2 = Integer.parseInt(stk.nextToken());
        int [] t = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int a = d1;
        for(int i = 0 ; i < m1; i++){
            a += t[i];
        }

        int b = d2;
        for(int i = 0 ; i < m2; i++){
            b += t[i];
        }

        System.out.println(b-a);

    }
}