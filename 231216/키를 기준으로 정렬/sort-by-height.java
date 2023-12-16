import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Info[] infos = new Info[n];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            String name = stk.nextToken();
            int h = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            infos[i] = new Info(name, h, w);
        }
        Arrays.sort(infos, (a, b) -> {
            return a.h - b.h;
        });
        for(Info info : infos){
            System.out.println(info.name + " " + info.h + " " + info.w);
        }
    }
    public static class Info{
        String name;
        int h;
        int w;
        public Info(String name, int h, int w){
            this.name = name;
            this.h = h;
            this.w = w;
        }
    }
}