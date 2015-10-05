import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static BigInteger solveNth(BigInteger a, BigInteger b, int n) {
        BigInteger TWO = new BigInteger ("2");
        BigInteger ONE = new BigInteger ("1");
        BigInteger ZERO = new BigInteger ("0");
        
        BigInteger result = new BigInteger("0");
        BigInteger total = new BigInteger("0");
        
        for(int i = 0;i<n;i++){
           total = a;
           result = b.multiply(b);
           result = result.add(a);
           
           a = b;
           b = result;
        }
        
        return total;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        
        BigInteger aTH = BigInteger.valueOf(a);
        BigInteger bTH = BigInteger.valueOf(b);
        
        System.out.println(solveNth(aTH,bTH,n));
        
    }
}