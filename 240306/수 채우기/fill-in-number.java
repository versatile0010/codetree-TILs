import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n / 5;
        n %= 5;
        cnt += n / 2;

        if(cnt ==0) cnt = -1;
        System.out.println(cnt);
    }
}