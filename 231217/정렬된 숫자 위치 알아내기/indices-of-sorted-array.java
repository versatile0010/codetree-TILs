import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int [] ranks = new int[n];

        Number [] numbers = new Number[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++){
            numbers[i] = new Number(Integer.parseInt(stk.nextToken()), i+1);
        }

        Arrays.sort(numbers, (a,b) -> {
            if(a.v != b.v) return a.v - b.v;
            return a.idx - b.idx;
        });

        for(int i = 0 ; i < n ; i++){
            Number cur = numbers[i];
            ranks[cur.idx-1] = i+1;
        }
        
        for(int i = 0 ; i < n ; i++){
            System.out.print(ranks[i]+" ");
        }

    }
    public static class Number{
        int v;
        int idx;
        public Number(int v, int idx){
            this.v = v;
            this.idx = idx;
        }
    }
}