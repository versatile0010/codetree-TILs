import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String [] groupA = new String[n];
        for(int i = 0 ; i < n; i++){
            groupA[i] = br.readLine();
        }
        String [] groupB = new String[n];
        for(int i = 0 ; i < n; i++){
            groupB[i] = br.readLine();
        }        

        int cnt = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = i+1; j < m; j++){
                for(int k = j+1; k < m ; k++){
                    if(isGood(groupA, groupB, i, j, k)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    public static boolean isGood(String [] groupA, String [] groupB, int x, int y, int z){
        // (x, y, z) 위치의 알파벳으로 groupA 와 groupB 를 완벽히 구분이 가능한 지 확인하자.
        HashSet<String> mapA = new HashSet<>();
        int n = groupA.length;
        for(int i = 0; i < n ; i++){
            char [] cur = groupA[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            sb.append(cur[x]);
            sb.append(cur[y]);
            sb.append(cur[z]);
            mapA.add(sb.toString());
        }

        for(int i = 0 ; i < n; i++){
            char [] cur = groupB[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            sb.append(cur[x]);
            sb.append(cur[y]);
            sb.append(cur[z]);
            if(mapA.contains(sb.toString())) {
                return false;
            }
        }
        return true;
    }
}