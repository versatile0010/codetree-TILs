import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            int x = Integer.parseInt(stk.nextToken());
            if(hm.containsKey(x)){
                System.out.print(hm.get(x)+" ");
            } else {
                System.out.print(0+" ");
            }
        }
    }
}