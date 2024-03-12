import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int [] a = new int [3];
        a[0] = Integer.parseInt(stk.nextToken());
        a[1] = Integer.parseInt(stk.nextToken());
        a[2] = Integer.parseInt(stk.nextToken());

        Arrays.sort(a);

        if(a[1] == (a[0] + a[2])/2) {
            System.out.println(0);
        }
        else if((a[1]-a[0] == 2 || a[2] - a[1] == 2)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }
}