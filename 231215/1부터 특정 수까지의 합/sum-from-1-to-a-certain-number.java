import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }

    public static int f(int n){
        int ret = 0;
        for(int i = 1 ; i <=n; i++){
            ret += i;
        }
        return ret / 10;
    }
}