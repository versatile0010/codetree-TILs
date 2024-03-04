import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] input = br.readLine().toCharArray();
        int n = input.length;

        int ans = 0;
        for(int i = 0 ; i < n; i++){
            if(input[i] == ')') continue;
            for(int j = i+1; j < n; j++ ) {
                if(input[j] == ')') {
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}