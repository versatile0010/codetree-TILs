import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] b = new int[n];
        boolean [] used = new boolean [n];
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < n ; i ++){
            b[i] = Integer.parseInt(br.readLine());
            hs.add(b[i]);
        }
        int bIdx = 0;
        int aIdx = 0;
        for(int x = 1; x <= 2*n; x++){
            if(!hs.contains(x)){
                a[aIdx++] = x;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int score = 0;
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(j < n && a[i] > b[j]) {
                score++;
                j++;
            }
        }
        System.out.println(score);
    }
}