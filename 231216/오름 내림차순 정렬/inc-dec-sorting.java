import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Integer [] A = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(A, Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            System.out.print(A[i]+" ");
        }        
    }
}