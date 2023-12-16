import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        char [] brr = br.readLine().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        String a = new String(arr);
        String b = new String(brr);

        if(a.equals(b)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}