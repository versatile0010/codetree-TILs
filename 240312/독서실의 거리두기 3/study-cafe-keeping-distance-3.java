import java.io.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int [] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = str.charAt(i) - '0';
        }
        // 가장 먼 pair 를 탐색하자
        int dist = 0;
        int st = 0;
        int end = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] == 1) {
                for(int j = i+1; j < n ; j++){
                    if(arr[j] != 1) continue;
                    int t = j - i;
                    if(t > dist) {
                        dist = t;
                        st = i;
                        end = j;
                    }
                    break;
                }
            }
        }
        arr[(end + st)/2] = 1;
        int ans = INT_MAX;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1){
                for(int j = i+1; j <  n; j++){
                    if(arr[j] != 1) continue;
                    ans = Math.min(ans, j-i);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}