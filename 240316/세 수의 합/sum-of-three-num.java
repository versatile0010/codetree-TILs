import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        HashMap<Integer, Integer> hm = new HashMap<>();
        stk = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], -1);
            } else {
                hm.put(arr[i], hm.get(arr[i])-1);
            }

            for(int j = 0 ; j < i ; j++){
                if(hm.containsKey(k - arr[i] - arr[j])){
                    cnt += hm.get(k - arr[i] - arr[j]);
                }
            }
        }
        System.out.println(cnt);
    }
}