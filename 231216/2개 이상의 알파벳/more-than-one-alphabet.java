import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        f(a);
    }
    public static void f(String a){
        int cnt = 0;
        int [] fre = new int[26];
        for(int i = 0 ; i < a.length(); i++){
            if(fre[a.charAt(i)-'a'] > 0){
                cnt++;
            }
            fre[a.charAt(i)-'a']++;
        }
        if(cnt > 1 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}