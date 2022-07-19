import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListNum1 = new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<Integer> arrListNum2 = new ArrayList<>(Arrays.asList(1,3,5,10,16));

        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Input : " + arrListNum1 + " dan " + arrListNum2);
 
        for (int i = 0; i <= arrListNum1.size() - 1; i++)
        {
            if(!arrListNum2.contains(arrListNum1.get(i)))
                result.add(arrListNum1.get(i));
        }

        System.out.println("Output : " + result);
    }
}