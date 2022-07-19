import java.util.*;

public class Problem5 {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> arrListNum1 = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 6, 9, 9));

        HashSet<Integer> result = new HashSet<Integer>(arrListNum1);

        System.out.println("Input : " + arrListNum1) ;
 
        System.out.println("Output : " + result.size());
    }
}