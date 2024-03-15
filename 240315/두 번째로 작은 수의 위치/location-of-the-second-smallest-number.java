import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> order = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            arr[i] = x;
            order.put(x, i+1);
            if(count.containsKey(x)){
                count.put(x, count.get(x) + 1);
            } else {
                count.put(x, 1);
            }
        }
        Arrays.sort(arr);
        int second = arr[1];
        if(count.get(second) > 1) {
            System.out.println(-1);
        } else {
            System.out.println(order.get(arr[1]));
        }
    }
}