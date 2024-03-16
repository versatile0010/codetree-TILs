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
            int x  = Integer.parseInt(stk.nextToken());
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(hm.keySet());
        Collections.sort(keyList, (Integer a, Integer b) -> {
            if(hm.get(a) == hm.get(b)){
                return b-a;
            }
            return hm.get(b) - hm.get(a);
        });
        for(int i = 0 ; i < k ; i++){
            System.out.print(keyList.get(i) + " ");
        }
    }
}