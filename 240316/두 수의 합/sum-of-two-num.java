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
        int [] numbers = new int[n];
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            numbers[i] = x;
        }
        
        int cnt = 0;
        for(int key : numbers){
            int t = k - key;
            if(hm.containsKey(t)){
                cnt += hm.get(t);
            } 
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        System.out.println(cnt);
    }
}