import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();
        int cnt = 0;
        for(int i = 0 ; i < n - 1; i++){
            if(input.charAt(i) == '(' && input.charAt(i+1) == '('){
                for(int j = i + 1; j < n - 1; j++){
                    if(input.charAt(j) == ')' && input.charAt(j+1) == ')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}