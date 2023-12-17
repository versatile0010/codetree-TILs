import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point [] points = new Point[n];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            points[i] = new Point(x, y, i+1);
        }        
        Arrays.sort(points, (a, b) -> {
            return (Math.abs(a.x) + Math.abs(a.y)) - (Math.abs(b.x) + Math.abs(b.y));
        });
        for(Point point : points){
            System.out.println(point.idx);
        }
    }
    public static class Point{
        int x;
        int y;
        int idx;
        public Point(int x, int y, int idx){
            this.x = x; 
            this.y = y;
            this.idx = idx;
        }
    }
}