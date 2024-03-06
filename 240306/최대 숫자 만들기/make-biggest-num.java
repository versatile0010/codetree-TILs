import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, (a, b)->{
            int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
            int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
            if(ba >= ab){
                return 1;
            }
            return -1;
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            sb.append(String.valueOf(arr[i]));
        }
        System.out.println(sb.toString());
    }
}