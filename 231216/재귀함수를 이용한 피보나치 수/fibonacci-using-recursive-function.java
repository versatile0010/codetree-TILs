import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    public static int f(int n){
        return (n==1 || n==2) ? 1 : f(n-1) + f(n-2);
    }
}