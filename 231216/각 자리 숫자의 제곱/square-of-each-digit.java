import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n < 10) return (int)Math.pow(n, 2);
        return f(n/10) + (int)Math.pow(n%10, 2);
    }
}