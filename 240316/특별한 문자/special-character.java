import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hm = new HashMap<>();
        String input = br.readLine();
        for(int i = 0 ; i < input.length(); i++){
            char c = input.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for(int i = 0 ; i < input.length(); i++){
            if(hm.get(input.charAt(i)) == 1){
                System.out.println(input.charAt(i));
                System.exit(0);
            }
        }
        System.out.println("None");
    }
}