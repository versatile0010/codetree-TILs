import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());

        int [] a = new int[n];
        int [] b = new int[n];
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(stk.nextToken());
            b[i] = Integer.parseInt(stk.nextToken());
        }
        int case1 = 0; // (1,3) (3,2) (2,1)
        int case2 = 0; // (1,2) (2,3) (3,1)
        for(int i = 0 ; i < n ; i++) {
            boolean win = false;
            if(a[i] == 1 && b[i] == 3) {
                win = true;
            }
            if(a[i] == 3 && b[i] == 2){
                win = true;
            }
            if(a[i] == 2 && b[i] == 1){
                win = true;
            }
            if(win) {
                case1++;
            }
        }
        for(int i = 0 ; i < n ; i++) {
            boolean win = false;
            if(a[i] == 1 && b[i] == 2) {
                win = true;
            }
            if(a[i] == 2 && b[i] == 3){
                win = true;
            }
            if(a[i] == 3 && b[i] == 1){
                win = true;
            }
            if(win) {
                case2++;
            }
        }        
        System.out.println(Math.max(case1, case2));
    }
}