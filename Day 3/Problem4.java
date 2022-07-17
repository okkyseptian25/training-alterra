import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number: ");
        int urInput = input.nextInt();
        input.close();
        
        int cek = 0;
        
        for (int i = 2; i <= urInput; i++){
            if (urInput % i == 0){
                cek++;
            } 
        }
        
        if (cek == 1){
            System.out.println(urInput+" Bilangan Prima");
        } else {
            System.out.println(urInput+" Bukan Bilangan Prima");
        } 
    }
}