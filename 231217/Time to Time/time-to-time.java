import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        
        int c = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken());

        System.out.println( c*60+d - a*60 - b );
    }
}