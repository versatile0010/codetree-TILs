import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Info[] infos = new Info[n];
        for(int i = 0; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            String name = stk.nextToken();
            int g = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            int s = Integer.parseInt(stk.nextToken());
            infos[i] = new Info(name, g, y, s);
        }
        Arrays.sort(infos, (a, b ) -> {
            if(a.g != b.g){
                return b.g - a.g;
            }
            if(a.y != b.y){
                return b.y - a.y;
            }
            return b.s - a.s;
        });
        for(Info info : infos){
            System.out.println(info.name + " " + info.g +" "+ info.y+" "+ info.s);
        }
        
    }
    public static class Info{
        String name;
        int g;
        int y;
        int s;
        public Info(String name, int g, int y, int s){
            this.name = name;
            this.g = g;
            this.y = y;
            this.s = s;
        }
    }
}