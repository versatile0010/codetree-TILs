import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    public static boolean f(int n){
        if(n % 4 == 0) {
            if(n % 100 == 0){
                if(n%400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } 
        return false;
    }
}