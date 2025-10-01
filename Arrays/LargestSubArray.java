package Arrays;

import java.util.*;

public class LargestSubArray {
    public int maxLen(int[] arr) {
        // Your code goes here
        Map<Integer,Integer> mp = new HashMap<>();
        int maxLen =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            int len =0;
            sum +=arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            // if same sum got previous the the sum from next index to current is solution
            // is (15,0) and after adding till index 5 we got again (15,5) now length is 5-0 =5  
            //-2, 2, -8, 1, 7 is solution
            if(mp.containsKey(sum)){
                len =i-mp.get(sum);
                maxLen = Math.max(maxLen, len);
            }else{
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};
        LargestSubArray l = new LargestSubArray();
        System.out.println(l.maxLen(arr));
    }
}
