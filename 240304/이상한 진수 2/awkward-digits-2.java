import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        StringBuilder sb;
        int ans = 0;
        for(int i = 0 ; i < binary.length(); i++){
            sb = new StringBuilder(binary);
            if(binary.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '0');
            }
            ans = Math.max(ans, toDecimal(sb.toString()));
        }
        System.out.println(ans);
    }

    public static int toDecimal(String binary){
        int n = binary.length();
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            if(binary.charAt(i) == '1'){
                result += Math.pow(2, n-i-1);
            }
        }
        return result;
    }
}