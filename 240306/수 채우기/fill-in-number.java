import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 100000;
        for(int i = 0 ; i <= 100000; i++){
            int r= n - 5*i;
            if(r >= 0 && r%2 == 0){
                ans = Math.min(ans, i + (r/2));
            }
        }
        if( ans == 100000) {
            ans = -1;
        }
        System.out.println(ans);
    }
}