import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.println(ten2to(to2ten(n)*17));
    }

    public static int to2ten(String src){
        int ret = 0;
        for(int i = 0 ; i < src.length(); i++){
            ret = ret*2 + (src.charAt(i)-'0'); 
        }
        return ret;
    }
    public static String ten2to(int src){
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(src < 2){
                list.add(src);
                break;
            }
            list.add(src%2);
            src /= 2;
        }
        String ret = "";
        for(int i = list.size()-1; i>=0; i--){
            ret += list.get(i);
        }
        return ret;
    }
}