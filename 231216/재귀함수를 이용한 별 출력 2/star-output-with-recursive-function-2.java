import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f(n);
    }
    public static void f(int n){
        if(n == 0) return;
        for(int i = 0 ; i < n ; i++){
            System.out.print("* ");
        }
        System.out.println();
        f(n-1);
        for(int i = 0 ; i < n ; i++){
            System.out.print("* ");
        }
        System.out.println();        
    }
}