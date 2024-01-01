import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            String x = br.readLine();
            if(x.charAt(0) == '-'){
                cnt++;
            } else {
                ans = Math.max(cnt, ans);
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}