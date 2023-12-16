import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f(n);
    }
    public static void f(int n){
        if(n==0) return;
        System.out.print(n+" ");
        f(n-1);
        System.out.print(n+" ");
    }
}