import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        System.out.println(lcm(n, m));
    }

    public static int gcd(int n, int m){
        return m == 0 ? n : gcd(m, n%m);
    }

    public static int lcm(int n, int m){
        return n * m / gcd(n, m);
    }
}