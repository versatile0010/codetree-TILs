import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        while(n-- > 0){
            String input = sortString(br.readLine());
            hm.put(input, hm.getOrDefault(input, 0) + 1);
        }
        int ans = 0;
        for(String key : hm.keySet()){
            ans = Math.max(ans, hm.get(key));
        }
        System.out.println(ans);
    }
    public static String sortString(String input){
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}