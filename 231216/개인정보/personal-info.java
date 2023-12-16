import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Info[] infos = new Info[5];
        for(int i = 0 ; i < 5; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            String name = stk.nextToken();
            int h = Integer.parseInt(stk.nextToken());
            float w = Float.parseFloat(stk.nextToken());
            infos[i] = new Info(name, h, w);
        }
        Arrays.sort(infos, (a, b)-> a.name.compareTo(b.name));
        System.out.println("name");
        for(Info info : infos){
            info.print();
        }
        System.out.println();
        Arrays.sort(infos, (a, b)-> b.h - a.h);
        System.out.println("height");
        for(Info info : infos){
            info.print();
        }        
    }
    public static class Info{
        String name;
        int h;
        float w;
        public Info(String name, int h, float w){            
            this.name = name;
            this.h = h;
            this.w = w;
        }
        public void print(){
            System.out.println(name + " " + h + " " + w);
        }
    }
}