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
        int ans = 0;
        boolean flag = false;
        for(char key : hm.keySet()){
            if(hm.get(key) == 1){
                ans = key;
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("None");
        } else {
            System.out.println((char)ans);
        }
    }
}