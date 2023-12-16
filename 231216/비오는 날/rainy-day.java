import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Info[] infos = new Info[n];
        for(int i = 0 ; i < n ; i++){
          StringTokenizer stk = new StringTokenizer(br.readLine());
          String date = stk.nextToken();
          String day = stk.nextToken();
          String w = stk.nextToken();
          infos[i] = new Info(date, day, w);
        }
        Arrays.sort(infos, Comparator.comparing(info -> info.date));

        for(Info ele : infos){
            if(ele.w.equals("Rain")){
                System.out.println(ele.date+" "+ele.day+" "+ele.w);
                break;
            }
        }
    }
    public static class Info{
        String date;
        String day;
        String w;
        
        public Info(String date, String day, String w){
            this.date = date;
            this.day = day;
            this.w = w;
        }

    }
}