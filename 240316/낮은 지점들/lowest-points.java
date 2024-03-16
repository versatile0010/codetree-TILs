import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            if(hm.containsKey(x)){
                if(hm.get(x) >= y){
                    hm.put(x, y);
                }
            } else {
                hm.put(x, y);
            }
        }
        int ans = 0;
        for(int key : hm.keySet()){
            ans += hm.get(key);
        }
        System.out.println(ans);
    }
}