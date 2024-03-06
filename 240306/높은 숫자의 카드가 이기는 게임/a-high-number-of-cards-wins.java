import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] b = new int[n];
        boolean [] used = new boolean [n];

        for(int i = 0 ; i < n ; i ++){
            b[i] = Integer.parseInt(br.readLine());
        }
        int bIdx = 0;
        int aIdx = 0;
        for(int x = 1; x <= 2*n; x++){
            if(!isContains(x, b)){
                a[aIdx++] = x;
            }
        }

        int score = 0;
        for(int i = 0; i < n ; i++){
            int bx = b[i];
            for(int j = 0 ; j < n ; j++){
                int ax = a[j];
                if(!used[j] && ax > bx){
                    score++;
                    used[j] = true;
                    break;
                }
            }
        }
        System.out.println(score);
    }
    public static boolean isContains(int x, int [] b){
        for(int ele : b){
            if( x == ele) {
                return true;
            }
        }
        return false;
    }
}