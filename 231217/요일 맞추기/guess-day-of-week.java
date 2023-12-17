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

        int srcDays = d1;
        for(int i = 0 ; i < m1-1; i++){
            srcDays += t[i];
        }
        
        int destDays = d2;
        for(int i = 0 ; i < m2-1; i++){
            destDays += t[i];
        }        

        int dayDiff = destDays-srcDays;
        int off = 1;
        String [] table = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int idx = (dayDiff%7 + off + 7)%7;
        System.out.println(table[idx]);
    }
}