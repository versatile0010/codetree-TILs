import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        for(int x = 1; x<=1000; x++){
            int cnt = 0;
            if(arr[0] > x){
                cnt++;
            }
            for(int j = 1; j < N; j++){
                if(arr[j] > x && arr[j-1] <= x) cnt++;
            }
            ans = Math.max(cnt, ans);
        }
        System.out.println(ans);
    }
}