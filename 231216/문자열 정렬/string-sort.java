import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String src = br.readLine();
        char [] c = src.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
    }
}