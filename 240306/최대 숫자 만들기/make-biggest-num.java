import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long [] arr = new Long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr, (a, b)->{
            long ab = Long.parseLong(String.valueOf(a) + String.valueOf(b));
            long ba = Long.parseLong(String.valueOf(b) + String.valueOf(a));
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