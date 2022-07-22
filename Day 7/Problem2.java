import java.util.Vector;
  
class Problem2 
{
    static int arrMoney[] = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
    static int n = arrMoney.length;
  
    static void findMin(int V)
    {
        // Initialize result 
        Vector<Integer> ans = new Vector<>();
        
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= arrMoney[i]) 
            {
                V -= arrMoney[i];
                ans.add(arrMoney[i]);
            }
        }
  
        // Print result 
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(" " + ans.elementAt(i) + " ");
        }
    }
    
    public static void main(String[] args) 
    {
        int n = 432;
        System.out.println("Input : " + n);
        System.out.print("Output : ");
        findMin(n);
    }
}