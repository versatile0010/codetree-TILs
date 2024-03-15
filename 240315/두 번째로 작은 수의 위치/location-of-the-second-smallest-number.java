import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        int [] arr = new int[n];
        int [] temp = new int[n];
        for(int i = 0 ; i < n ; i++){
            int x = Integer.parseInt(stk.nextToken());
            arr[i] = x;
            temp[i] = x;
        }
        Arrays.sort(arr);
        int first = arr[0];
        int second = 0;
        boolean isExist = false;
        for(int i = 1; i < n ; i++){
            if(first != arr[i]){
                second = arr[i];
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println(-1);
        } else {
            int ans = -1;
            for(int i = 0; i < n ; i++){
                if(temp[i] == second) {
                    if(ans != -1) {
                        System.out.println(-1);
                        break;
                    }
                    ans = i+1;
                }
            }
            System.out.println(ans);
        }

    }
}