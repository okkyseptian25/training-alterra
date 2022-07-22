import java.util.*;
import java.lang.Math;

class Problem1 {
    
    public static String resultOutput(double A, double B, double C) {
        double x, y, z;
        double result1, result2, result3;
        
        x = 1;
        y = 2;
        z = 3;
        
        result1 = x + y + z;
        result2 = x * y * z;
        result3 = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        
        int ix = (int)x;
        int iy = (int)y;
        int iz = (int)z;
        
        int iA = (int)A;
        int iB = (int)B;
        int iC = (int)C;
        
        if (A == result1 && B == result2 && C == result3) {
            return "Input : " + String.valueOf(iA) + " " + String.valueOf(iB) + " " + String.valueOf(iC) + "\n" + "Output : " + String.valueOf(ix) + " " + String.valueOf(iy) + " " + String.valueOf(iz);
        } else {
            return "Input : " + String.valueOf(iA) + " " + String.valueOf(iB) + " " + String.valueOf(iC) + "\n" + "Output : " + "No Solution";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(resultOutput(6, 6, 14));
    }
}