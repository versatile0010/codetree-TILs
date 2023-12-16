import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        up(n);
        System.out.println();
        down(n);
    }
    public static void up(int n){
        if(n == 0) return;
        up(n-1);
        System.out.print(n+" ");
    }
    public static void down(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        down(n-1);
    }
}