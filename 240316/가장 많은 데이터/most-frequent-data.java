import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        while(n-- > 0){
            String key = br.readLine();
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        int ans = 0;
        for(String key : hm.keySet()){
            ans = Math.max(hm.get(key), ans);
        }
        System.out.println(ans);
    }
}