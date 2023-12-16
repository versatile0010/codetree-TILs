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
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            int c = Integer.parseInt(stk.nextToken());
            infos[i] = new Info(name, a, b, c);
        }
        Arrays.sort(infos, (x,y)->{
            return (x.a + x.b + x.c) - (y.a + y.b + y.c);
        });
        for(Info info : infos){
            System.out.println(info.name + " " + info.a + " " + info.b + " " + info.c);
        }

    }
    public static class Info{
        String name;
        int a;
        int b;
        int c;
        public Info(String name, int a, int b, int c){
            this.name = name;
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
}