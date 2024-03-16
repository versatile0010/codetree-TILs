import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hm = new HashMap<>();
        while(n -- > 0){
            String [] input = br.readLine().split(" ");
            String op = input[0];
            if("add".equals(op)){
                int k = Integer.parseInt(input[1]);
                int v = Integer.parseInt(input[2]);
                hm.put(k, v);
            }
            if("remove".equals(op)){
                int k = Integer.parseInt(input[1]);
                hm.remove(k);
            }
            if("find".equals(op)){
                int k = Integer.parseInt(input[1]);
                if(hm.containsKey(k)){
                    System.out.println(hm.get(k));
                } else {
                    System.out.println("None");
                }
            }
        }
    }
}