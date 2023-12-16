import java.io.*;
import java.util.*;

public class Main {
    
    static String src;
    static String dest;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        src = br.readLine();
        dest = br.readLine();
        System.out.println(src.indexOf(dest));
    }
}