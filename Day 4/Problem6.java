import java.util.*;

public class Problem6 {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> arrListNum1 = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        System.out.println("Input : " + arrListNum1) ;

        Scanner k = new Scanner(System.in);
        System.out.print("k = ");
        int numK = k.nextInt();
        k.close();
 
        System.out.println(maxSum(arrListNum1, arrListNum1.size(), numK));
    }

    public static int maxSum(ArrayList<Integer> arrListNum1, int n, int k)
    {
        if (n < k)
        {
           System.out.println("Invalid");
           return -1;
        }
        
        int res = 0;
        for (int i=0; i<k; i++)
           res += arrListNum1.get(i);
           
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arrListNum1.get(i) - arrListNum1.get(i-k);
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }
}