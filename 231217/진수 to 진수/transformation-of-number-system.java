import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        String n = br.readLine();

        // a 진수로 주어진 n 을 b 진수로 변환하여 출력하자.
        System.out.println(convert(a, b, n));
    }
    public static String convert(int a, int b, String src){
        // a->10
        int ten = 0;
        for(int i = 0 ; i < src.length(); i++){
            ten = ten*a + (src.charAt(i) - '0');
        }

        // 10 -> b
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(ten < b){
                list.add(ten);
                break;
            }
            list.add(ten%b);
            ten /= b;
        }
        String ret = "";
        for(int i = list.size()-1; i>=0; i--){
            ret += list.get(i);
        }
        return ret;
    }
}