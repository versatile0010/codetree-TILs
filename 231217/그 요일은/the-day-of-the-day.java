import java.io.*;
import java.util.*;

public class Main {
    static int [] dayTable = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String [] dict = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(stk.nextToken());
        int d1 = Integer.parseInt(stk.nextToken());
        int m2 = Integer.parseInt(stk.nextToken());
        int d2 = Integer.parseInt(stk.nextToken());

        String day = br.readLine();
        int targetIdx = -1;
        for(int i = 0 ; i < dict.length; i++){
            if(day.equals(dict[i])){
                targetIdx = i;
            }
        }

        int dayDiff = getDays(m2, d2) - getDays(m1, d1);
        int cnt = 0;
        for(int i = 0; i <= dayDiff; i++){
            //System.out.println(i%7);
            if(i%7 == targetIdx){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    
    public static int getDays(int m, int d){
        int ret = d;
        for(int i = 0 ; i < m-1 ; i ++){
            ret += dayTable[i];
        }
        return ret;
    }
}