import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] a = new String[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = br.readLine();
        }
        Arrays.sort(a);
        for(String ele : a){
            System.out.println(ele);
        }
    }
}