import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int [] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = str.charAt(i) - '0';
        }

        // 가장 먼 두 위치를 표시하자.
        int prev = -1;
        int diff = -1;
        int st = -1;
        int end = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1) {
                if(prev != -1) {
                    int dist = i - prev;
                    if(diff <= dist) {
                        diff = dist;
                        st = prev;
                        end = i;
                    }
                }
            }
            prev = i;
        }
        // 가장 먼 거리를 가진 좌표는 st 와 prev 이다.
        arr[(end + st)/2] = 1;

        int ans = Integer.MAX_VALUE;
        prev = -1;
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] == 1 && prev != -1) {
                int dist = i - prev + 1;
                ans = Math.min(ans, dist);
            }
            prev = i;
        }
        System.out.println(ans);
    }

}