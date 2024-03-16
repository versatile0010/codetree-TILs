import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        
        int cnt = 0;
        for(int key : hm.keySet()){
            int t = k - key;
            if(hm.containsKey(t)){
                if(t == key && hm.get(key) >= 2) {
                    hm.put(key, hm.get(key) - 1);
                } 
                cnt++;
            }
            //hm.put()
        }
        System.out.println(cnt/2);
    }
}