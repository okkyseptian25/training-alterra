import java.util.*;

public class Problem3 {
    private static SortedMap<Integer, List<Integer>> map1 = new TreeMap<Integer, List<Integer>>();
    private static SortedMap<Integer, List<Integer>> map2 = new TreeMap<Integer, List<Integer>>();

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);  

        ArrayList<Integer> arrListNum1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));

        ArrayList<Integer> arrListNum2 = new ArrayList<Integer>(Arrays.asList(2,5,9,11));

        //Input
        System.out.println("Input1: " + arrListNum1);
         
        System.out.print("Target1= ");
        int urInput1 = input1.nextInt();
        
        //Input
        System.out.println("Input2: " + arrListNum2);
        
        System.out.print("Target2= ");
        int urInput2 = input2.nextInt();

        input1.close();
        input2.close();

        sample1(arrListNum1, urInput1, arrListNum2, urInput2);
    }

    public static void sample1(ArrayList<Integer> arrListNum1, int urInput1, ArrayList<Integer> arrListNum2, int urInput2) {
        Problem3 obj = new Problem3();

        System.out.println("Output1: " + obj.printPairs1(arrListNum1, arrListNum1.size(), urInput1));

        sample2(arrListNum2, urInput2);
    }

    public static void sample2(ArrayList<Integer> arrListNum2, int urInput2) {
        Problem3 obj = new Problem3();

        System.out.println("Output2: " + obj.printPairs2(arrListNum2, arrListNum2.size(), urInput2));
    }

    String printPairs1(ArrayList<Integer> arrListNum, int n, int target) {
        for(int i = 0; i < n; i++){
            List<Integer> indexList = map1.get(arrListNum.get(i));
            if(indexList == null){
                List<Integer> newIndexList = new ArrayList<Integer>();
                newIndexList.add(i);
                map1.put(arrListNum.get(i), newIndexList);
            }else{
                indexList.add(i);
            }
        }

        Set s = map1.entrySet(); 

        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

        // Using iterator in SortedMap 
        Iterator it = s.iterator(); 

        String finalOutput1 = "";

        while (it.hasNext()) 
        { 
            Map.Entry m = (Map.Entry)it.next(); 

            int key = (Integer)m.getKey(); 
            List<Integer> indexList1 = (List<Integer>)m.getValue();

            if(map1.containsKey(target-key)){

                List<Integer> indexList2 = (List<Integer>)map1.get(target-key);

                for(int i=0;i<indexList1.size();i++){

                    if(!visited.containsKey(indexList1.get(i))){

                        for(int j = 0; j < indexList2.size(); j++){
                            if(!(finalOutput1.equals("") || finalOutput1==null)){
                                finalOutput1 += ", ";
                            }
                            finalOutput1 += "(" + indexList1.get(i) + "," + indexList2.get(j) + ")";
                            visited.put(indexList2.get(j), true);
                        }
                        visited.put(indexList1.get(i), true);
                    }
                }
            } 
        }

        return finalOutput1;
    }

    String printPairs2(ArrayList<Integer> arrListNum, int n, int target) {
        for(int i = 0; i < n; i++){
            List<Integer> indexList = map2.get(arrListNum.get(i));
            if(indexList == null){
                List<Integer> newIndexList = new ArrayList<Integer>();
                newIndexList.add(i);
                map2.put(arrListNum.get(i), newIndexList);
            }else{
                indexList.add(i);
            }
        }

        Set s = map2.entrySet(); 

        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

        // Using iterator in SortedMap 
        Iterator it = s.iterator(); 

        String finalOutput2 = "";

        while (it.hasNext()) 
        { 
            Map.Entry m = (Map.Entry)it.next(); 

            int key = (Integer)m.getKey(); 
            List<Integer> indexList1 = (List<Integer>)m.getValue();

            if(map2.containsKey(target-key)){

                List<Integer> indexList2 = (List<Integer>)map2.get(target-key);

                for(int i=0;i<indexList1.size();i++){

                    if(!visited.containsKey(indexList1.get(i))){

                        for(int j = 0; j < indexList2.size(); j++){
                            if(!(finalOutput2.equals("") || finalOutput2==null)){
                                finalOutput2 += ", ";
                            }
                            finalOutput2 += "(" + indexList1.get(i) + "," + indexList2.get(j) + ")";
                            visited.put(indexList2.get(j), true);
                        }
                        visited.put(indexList1.get(i), true);
                    }
                }
            } 
        }

        return finalOutput2;
    }
}