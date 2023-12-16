import java.io.*;
import java.util.*;

public class Main {
    
    static String src;
    static String dest;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        src = br.readLine();
        dest = br.readLine();
        System.out.println(findIdx(src, dest));
    }

    public static int findIdx(String str, String dest){
        for(int i = 0 ; i <str.length(); i++){
            if(isSubString(i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean isSubString(int st){
        if(st + dest.length() - 1 >= src.length()){
            return false;
        }
        for(int j = 0 ; j < dest.length(); j++){
            if(src.charAt(st + j) != dest.charAt(j)){
                return false;
            }
        }
        return true;
    }
}