import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        int [] arr = new int [2001];

        int prev = 1000;
        for(int i = 0 ; i < n ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            String op = stk.nextToken();
            int j = 0;
            if("R".equals(op)){
                for(j = prev; j < prev+x; j++){
                    arr[j]++;
                }
            } else { 
                for(j = prev; j > prev-x; j--){
                    arr[j]++;
                }
            }
            prev = j;
        }

        int cnt = 0 ;
        for(int i = 0; i <= 2000; i++){
            if(arr[i]>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}