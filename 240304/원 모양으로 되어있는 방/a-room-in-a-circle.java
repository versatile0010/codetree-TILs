import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            int t = 0;
            for(int j = 0 ; j < n ; j++){
                int d = (j + n - i) % n;
                t += (d*a[j]);
            }
            ans = Math.min(ans, t);
        }
        System.out.println(ans);
    }
}