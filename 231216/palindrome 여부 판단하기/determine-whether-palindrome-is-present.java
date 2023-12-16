import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String src = br.readLine();
        f(src);
    }
    public static void f(String src){
        int l = 0;
        int r = src.length()-1;
        while(l<=r){
            if(src.charAt(l)!=src.charAt(r)){
                System.out.println("No");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Yes");
    }
}