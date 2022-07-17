import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String urInput = input.nextLine();
        input.close();
        
        int vowels = 0, consonants = 0, digits = 0, characters = 0;
        urInput = urInput.toLowerCase();
        for (int i = 0; i < urInput.length(); ++i) {
            char ch = urInput.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }

            // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z')) {
                 ++consonants;
            }
                
            // check if character is in between 0 to 9
            else if (ch >= '0' && ch <= '9') {
                ++digits;
            }

            // check if character is space
            else if (ch == ' ') {
                characters++;
            }
        }

        int totalInput = urInput.length() - characters;
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Total Character: " + totalInput);
    }
}