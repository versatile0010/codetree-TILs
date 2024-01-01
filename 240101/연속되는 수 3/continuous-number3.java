import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int ans = -1;
        String [] arr = new String[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = br.readLine();
        }
        for(int i = 0 ; i < n ; i++){
            if(i == 0 || check(arr[i], arr[i-1])) {
                cnt++;
                ans = Math.max(cnt, ans);
            } else {
                cnt=1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(String a, String b){
        if(a.charAt(0) == '-' && b.charAt(0) == '-'){
            return true;
        } else if (a.charAt(0) == '-' && b.charAt(0) != '-'){
            return false;
        } else if (a.charAt(0) != '-' && b.charAt(0) == '-'){
            return false;
        } else return true;
    }
}