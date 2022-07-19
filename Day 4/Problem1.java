import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> lstName1 = new ArrayList<String>();
        ArrayList<String> lstName2 = new ArrayList<String>();

        ArrayList<String> lstName3 = new ArrayList<String>();
        ArrayList<String> lstName4 = new ArrayList<String>();

        sample2(lstName1, lstName2);
        sample1(lstName3, lstName4);
    }

    public static void sample1(ArrayList<String> lstName1, ArrayList<String> lstName2) {
        // Add elements to ArrayList 1
        lstName1.add("lee");
        lstName1.add("jin");

        // Add elements to ArrayList 2
        lstName2.add("kazuya");
        lstName2.add("panda");

        //Input
        System.out.println("Input: " + lstName1 + ", " + lstName2);

        ArrayList<String> lstJoinName = new ArrayList<String>();
        
        for (int i = 0; i < lstName1.size(); ++i) {
            String name = lstName1.get(i);
            lstJoinName.add(name);
        }

        for (int i = 0; i < lstName2.size(); ++i) {
            String name = lstName2.get(i);
            lstJoinName.add(name);
        }
        
        // create HashSet
        HashSet<String> resultLstName = new HashSet<String>(lstJoinName);

        //Output
        System.out.println("Output: " + resultLstName);
    }

    public static void sample2(ArrayList<String> lstName3, ArrayList<String> lstName4) {
        // Add elements to ArrayList 1
        lstName3.add("kazuya");
        lstName3.add("jin");
        lstName3.add("lee");

        // Add elements to ArrayList 2
        lstName4.add("kazuya");
        lstName4.add("feng");

        //Input
        System.out.println("Input: " + lstName3 + ", " + lstName4);

        ArrayList<String> lstJoinName = new ArrayList<String>();
        
        for (int i = 0; i < lstName3.size(); ++i) {
            String name = lstName3.get(i);
            lstJoinName.add(name);
        }

        for (int i = 0; i < lstName4.size(); ++i) {
            String name = lstName4.get(i);
            lstJoinName.add(name);
        }
        
        // create HashSet
        HashSet<String> resultLstName = new HashSet<String>(lstJoinName);

        //Output
        System.out.println("Output: " + resultLstName);
        System.out.println("\n");
    }
}