import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        int cnt = 0;
        for(int i = x; i <= y; i++){
            if(isGood(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isGood(int n){
        int [] t = new int[10];
        int size = 0;
        while(n > 0){
            t [n%10] ++;
            size++;
            n/=10;
        }

        boolean flag = false;

        for(int j = 0; j <= 9; j++){
            if(t[j] == size - 1){
                flag = true;
            }
        }
        return flag;
    }
}