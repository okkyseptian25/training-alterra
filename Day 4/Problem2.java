import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListNum = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);  
        System.out.print("Input your number: ");
        String urInput = input.nextLine();
        input.close();
        
        if (urInput.matches("[0-9]*")) {
            for (int i = 0; i < urInput.length(); ++i) {
                char ch = urInput.charAt(i);
                String strNum = String.valueOf(ch);
                Integer number = Integer.parseInt(strNum);

                arrListNum.add(number);
            }
            
            HashSet<Integer> sortDuplicateLstNum = new HashSet<>(arrListNum);

            ArrayList<Integer> resultArrListNum = new ArrayList<Integer>();

            for (Integer item : sortDuplicateLstNum) {
                if (arrListNum.stream().filter(x -> !x.equals(item)).count() == arrListNum.size() - 1) {
                    resultArrListNum.add(item);
                }
            }

            //Output
            System.out.println("Output: " + resultArrListNum);
        } else {
            System.out.println("your input must be number");
        }
        
    }
}