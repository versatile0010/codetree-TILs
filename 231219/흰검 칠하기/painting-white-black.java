import java.io.*;
import java.util.*;

public class Main {
    static int [] st = new int[200001];
    static int [] end = new int[200001];
    static ArrayList<Integer> [] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        check = new ArrayList[200001];

        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            String op = stk.nextToken();
            
        }
    }
}