import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int maxProfit = 0;
        int minPrice = arr[0];
        for(int i = 0 ; i < n ; i++){
            int p = arr[i] - minPrice;
            if(p > maxProfit){
                maxProfit = p;
            }
            if(minPrice > arr[i]){
                minPrice = arr[i];
            }
        }
        System.out.println(maxProfit);
    }
}