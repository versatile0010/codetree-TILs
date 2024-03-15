import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            String op = stk.nextToken();
            int s = Integer.parseInt(stk.nextToken());
            if("A".equals(op)) {
                if(status(a, b, c) != status(a + s, b, c)) {
                    cnt++;
                    a += s;
                }
            } else if("B".equals(op)) {
                if(status(a, b, c) != status(a, b + s, c)) {
                    cnt++;
                    b += s;
                }
            } else { // C
                if(status(a, b, c) != status(a, b, c+s)){
                    cnt++;
                    c += s;
                }
            }
            //System.out.println("a==" + a + ", b==" + b + ", c==" + c);
        }
        System.out.println(cnt);
    }
    public static int status(int a, int b, int c){
        if(a>b && a>c) {
            return 1;
        }
        if(b>a && b>c){
            return 2;
        }
        if(c>a && c>b) {
            return 3;
        }
        if(a==b && b > c){
            return 4;
        }
        if(a==c && c > b) {
            return 5;
        }
        if(b==c && c > a){
            return 6;
        }
        return 7;
    }
}