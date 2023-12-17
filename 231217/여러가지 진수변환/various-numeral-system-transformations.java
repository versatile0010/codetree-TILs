import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int src = Integer.parseInt(stk.nextToken());
        int notation = Integer.parseInt(stk.nextToken());
        System.out.println(f(src, notation));
    }
    public static String f(int src, int notation){
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(src < notation){
                list.add(src);
                break;
            }
            list.add(src%notation);
            src /= notation;
        }
        String ret = "";
        for(int i = list.size()-1; i>=0; i--){
            ret += list.get(i);
        }
        return ret;
    }
}