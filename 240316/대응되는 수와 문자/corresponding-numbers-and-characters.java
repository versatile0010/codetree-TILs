import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<Integer, String> stringByInteger = new HashMap<>();
        HashMap<String, Integer> integerByString = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            String c = br.readLine();
            stringByInteger.put(i+1, c);
            integerByString.put(c, i+1);
        }
        for(int i = 0 ; i < m ; i++){
            String op = br.readLine();
            char c = op.charAt(0);
            if('a' <= c && c <= 'z') {
                // key 가 문자
                System.out.println(integerByString.get(op));
            } else {
                // key 가 숫자
                System.out.println(stringByInteger.get(Integer.parseInt(op)));
            }
        }
    }
}