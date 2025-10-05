package BS;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSorted {
  /*   private static int singleElementInSorted(int arr[]){
        Map<Integer,Integer> mp = new HashMap<>();
        int count =0;
        for(int a : arr){
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }
        return -1;
    }*/

    // optimized code 
    private static int singleElementInSorted(int arr[]){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low = 1;
        int high = n-2;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }else if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1])
            // need to write two conditions here because if mid is odd and mid&previous is 
            // not same. we need to check in right
            // same way if mid is even and its right element is not same so we need to check in 
            // left side where right is sorted with two elements
            {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
       System.out.println(singleElementInSorted(arr));
    }
}
