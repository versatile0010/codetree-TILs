import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    public static String f(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(n < 2){
                list.add(n);
                break;
            }
            list.add(n%2);
            n/=2;
        }
        String ret = "";
        for(int i = list.size()-1; i>=0; i--){
            ret += list.get(i);
        }
        return ret;
    }
}