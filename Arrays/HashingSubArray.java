package Arrays;

import java.util.*;

public class HashingSubArray {
    private static void hashingSubArray(int arr[],int k){
        int prefixSum = 0;
        int maxLength =0;
        int start =0;
        int end =0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum +=arr[i];
            if(prefixSum==k){
                maxLength = i+1;
                start=0;
                end=i;
            }
            int rem = prefixSum-k;
            if(mp.containsKey(rem)){
                int len = i-mp.get(rem);
                if(len > maxLength){
                        maxLength = len;
                        start = mp.get(rem) + 1;
                        end = i;    
                }
            }
            if(!mp.containsKey(prefixSum)){
                mp.put(prefixSum, i);
            }
        }
        System.out.println(maxLength);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,3,5,6,2,1};
        int k=16;
        hashingSubArray(arr,k);
    }
}
