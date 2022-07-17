import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number: ");
        int urInput = input.nextInt();
        input.close();
        
        System.out.println("Output factor :");
        int factor = 0;
        for (int i = 0; i <= urInput; i++) {
            factor++;
            if (urInput % factor == 0) {
                System.out.print(factor + " ");
            }
        }
    }
}