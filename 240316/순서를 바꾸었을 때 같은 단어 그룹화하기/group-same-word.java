import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        while(n-- > 0){
            String input = br.readLine();
            String t = f(input);
            //System.out.println(t);
            hm.put(t, hm.getOrDefault(t, 0) + 1);
        }
        List<String> keyList = new ArrayList<>(hm.keySet());
        Collections.sort(keyList, (String a, String b) -> {
            return hm.get(b) - hm.get(a);
        });
        System.out.println(hm.get(keyList.get(0)));
    }
    public static String f(String str){
        
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);

        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < str.length(); i++){
            char x = str.charAt(i);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char key : hm.keySet()){
            sb.append(String.valueOf(key) + hm.get(key));
        }
        return sb.toString();
    }
}