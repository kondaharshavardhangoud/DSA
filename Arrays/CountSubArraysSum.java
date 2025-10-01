package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysSum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int maxCount =0;
         int sum =0;
        mp.put(0,1);
        for(int a : nums){
            sum += a;
            int rem = sum -k;
            maxCount += mp.getOrDefault(rem, 0);    
            mp.put(sum, mp.getOrDefault(sum, 0)+1) ;
        }
        return maxCount;
    } 
    public static void main(String[] args) {
        int arr[]={1, 1, 1};
        int k=2;
        CountSubArraysSum c = new CountSubArraysSum();
        System.out.println(c.subarraySum(arr, k));
    }
}
