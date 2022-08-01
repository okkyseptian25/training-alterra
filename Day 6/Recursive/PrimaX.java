import java.util.*;

public class PrimaX{
    public static void main(String[] args) {
        int i =0;
        int num =0;
        ArrayList<Integer> listBilanganPrima = new ArrayList<Integer>();

        for (i = 1; i <= 100; i++)         
        { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	        {
                if(i%num==0)
	            {
 		            counter = counter + 1;
	            }
	        }
            if (counter ==2)
            {
                listBilanganPrima.add(i);
            }	
        }	

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        Integer input = scanner.nextInt();

        System.out.println("Output : " + listBilanganPrima.get(input - 1));

        scanner.close();
    }
}