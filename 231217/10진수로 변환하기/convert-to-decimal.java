import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String src = br.readLine();
        System.out.println(f(src));
    }
    public static int f(String src){
        int ret = 0;
        for(int i = 0 ; i < src.length(); i++){
            ret = ret*2 + (src.charAt(i)-'0');
        }
        return ret;
    }
}