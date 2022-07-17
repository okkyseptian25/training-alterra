import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String urInput = input.nextLine();
        input.close();

        String reverseUrInput = "";
        urInput = urInput.toLowerCase();
        for (int i = (urInput.length() - 1); i >= 0; i--) {
            reverseUrInput = reverseUrInput + urInput.charAt(i);
        }

        if (urInput.equals(reverseUrInput.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
}