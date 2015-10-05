import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int d1, m1, y1, d2, m2, y2;
        int fridays = 0;
        Date start, end;
        
        for (int i = 0; i<t; i++){
            fridays = 0;
            d1 = sc.nextInt();
            m1 = sc.nextInt();
            y1 = sc.nextInt();
            d2 = sc.nextInt();
            m2 = sc.nextInt();
            y2 = sc.nextInt();
            
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            c1.set(y1, m1-1, d1);
            c2.set(y2,m2-1,d2);
            
            
            Date date2 = c2.getTime();
            
 
            while(!c1.getTime().after(date2)) {
                int dayOfWeek = c1.get(Calendar.DAY_OF_WEEK);
                int dayOfMonth = c1.get(Calendar.DAY_OF_MONTH);
                
                if(dayOfWeek == Calendar.FRIDAY && dayOfMonth == 13){
                    fridays++;
                }
                c1.add(Calendar.DAY_OF_MONTH, 1);
            }
            System.out.println(fridays);

            
        }
    }
}