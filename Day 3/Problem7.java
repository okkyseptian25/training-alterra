import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        int urInput = input.nextInt();
        input.close();
        
        topBottom(urInput);
    }
    
    public static void topBottom(int n) {
        // prints n lines
        for (int i = 0; i <= n; i++) {
            // followed by n asterisks
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}