import java.io.*;
import java.util.*;

// 4 6 9 11 : 30

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int Y = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());

        if(isValid(Y, M, D)){
            System.out.println(getSeason(M));
        } else {
            System.out.println("-1");
        }

    }

    public static boolean isLeapYear(int y){
        if(y % 4 == 0){
            if( y % 100 == 0){
                if ( y % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } 
            return true;
        }
        return false;
    }

    public static boolean isValid(int y, int m, int d){
        if(m < 0 || m > 12 || d < 0) return false;
        if(m==2){
            if(isLeapYear(y) && d <= 29){
                return true;
            } else if( d<= 28) {
                return true;
            } else {
                return false;
            }
        }
        if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d <= 30){
                return true;
            } else {
                return false;
            }
        } else if(d <= 31){
            return true;
        } else {
            return false;
        }
    }
    public static String getSeason(int m){
        if(m == 3 || m == 4 || m == 5){
            return "Spring";
        }
        if(m == 6 || m == 7 || m == 8){
            return "Summer";
        }
        if(m ==9 || m == 10 || m == 11){
            return "Fall";
        }
        if(m == 12 || m ==1 || m ==2){
            return "Winter";
        } 
        return "-1";
    }
}