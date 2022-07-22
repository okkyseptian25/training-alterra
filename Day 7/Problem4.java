import java.util.*;

class Problem4 {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            
            if (arr[mid] == x)
                return mid;
                
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
                
            return binarySearch(arr, mid + 1, r, x);
        } else {
            return -1;
        }
    }
    
    public static void main(String args[]) {
        Problem4 ob = new Problem4();
        int arr[] = { 1, 1, 3, 5, 5, 6, 7 };
        int n = arr.length;
        int x = 3;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        
        System.out.println("Output : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
    }
}