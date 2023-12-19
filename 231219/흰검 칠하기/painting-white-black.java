import java.io.*;
import java.util.*;

public class Main {
    static int [] st = new int[200001];
    static int [] end = new int[200001];
    static String [] ops;
    static ArrayList<Integer> [] check;
    static int B = 0;
    static int W = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ops = new String[n];
        check = new ArrayList[200001];
        for(int i = 0 ; i <= 200000; i++){
            check[i] = new ArrayList<>();
        }
        int cur = 100000;
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            String op = stk.nextToken();
            ops[i] = op;
            if("R".equals(op)){
                st[i] = cur;
                end[i] = cur + x;
                cur += x;
            } else {
                st[i] = cur;
                end[i] = cur - x;
                cur -= x;
            }
        }

        for(int i = 0 ; i < n ; i++){
            if("R".equals(ops[i])){
                for(int j = st[i]; j < end[i]; j++){
                    check[j].add(B);
                }
            } else {
                for(int j = st[i]; j > end[j]; j--){
                    check[j].add(W);
                }
            }
        }

        int [] ansList = new int [3];
        for(int i = 0 ; i <= 200000; i++){
            if(check[i].isEmpty()) continue;
            if(check[i].size() < 4){
                ansList[check[i].get(check[i].size()-1)]++;
            } else {
                int bCnt = 0;
                int wCnt = 0;
                for(int j = 0; j < check[i].size(); j++){
                    if(check[i].get(j)==B){
                        bCnt++;
                    } else {
                        wCnt++;
                    }
                }
                if(bCnt >= 2 && wCnt >= 2){
                    ansList[2]++;
                } else {
                    ansList[check[i].get(check[i].size()-1)]++;
                }
            }
        }
    }
}