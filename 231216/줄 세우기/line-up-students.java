import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Info[] infos = new Info[n];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            infos[i] = new Info(h, w, i+1);
        }
        Arrays.sort(infos, (a, b)->{
            if(a.h != b.h){
                return b.h - a.h;
            } else if(a.w != b.w){
                return b.w - a.w;
            }
            return a.idx - b.idx;
        });
        for(Info info : infos){
            System.out.println(info.h +" " + info.w + " " + info.idx);
        }
        
    }

    public static class Info{
        int h;
        int w;
        int idx;
        public Info(int h, int w, int idx){
            this.h = h;
            this.w = w;
            this.idx = idx;
        }
    }
}