import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int cnt = 0;
        for(int i = 0 ; i < n ; i ++){
            if(input.charAt(i) == 'C') {
                for(int j = i+1; j < n ; j++){
                    if(input.charAt(j) == 'O') {
                        for(int k = j+1; k < n ; k++){
                            if(input.charAt(k) == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}