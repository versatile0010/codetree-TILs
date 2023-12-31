import java.io.*;
import java.util.*;

public class Main {

    static final int B = 1;
    static final int W = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] st = new int [1000001];
        int [] end = new int [1000001];
        int [] check = new int [200001];

        int cur = 100000;
        for(int i = 0 ; i < n; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            String op = stk.nextToken();

            if("L".equals(op)){
                st[i] = cur;
                end[i] = cur - x;
                for(int j = st[i]; j > end[i]; j--){
                    //System.out.println("L:"+(j-100000));
                    check[j] = W;
                }
                cur = end[i] + 1;
            } else {
                st[i] = cur;
                end[i] = cur + x;
                for(int j = st[i]; j < end[i]; j++){
                    //System.out.println("R:"+(j-100000));
                    check[j] = B;
                }
                cur = end[i] - 1;
            }
        }
        int white = 0;
        int black = 0;
        for(int ele : check){
            if(ele == B){
                black++;
            } else if(ele == W){
                white++;
            }
        }
        System.out.println(white + " " + black);
    }
}