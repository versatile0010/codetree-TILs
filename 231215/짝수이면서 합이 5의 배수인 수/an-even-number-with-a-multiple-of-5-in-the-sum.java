import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    public static String f(int n){
        return (n % 2 == 0) && (n/10 + n%10)%5 == 0 ? "Yes" : "No";
    }
}