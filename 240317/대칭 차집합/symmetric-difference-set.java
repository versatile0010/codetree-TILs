import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int na = Integer.parseInt(stk.nextToken());
        int nb = Integer.parseInt(stk.nextToken());

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> union = new HashSet<>();

        // a 원소
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < na; i++){
            int x = Integer.parseInt(stk.nextToken());
            a.add(x);
            union.add(x);
        }
        // b 원소
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < nb; i++){
            int x = Integer.parseInt(stk.nextToken());
            b.add(x);
            union.add(x);
        }    

        int ans = (union.size() - a.size() + union.size() - b.size());
        System.out.println(ans);
    }
}