package Arrays;

import java.util.Arrays;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        //bruteforce
        int arr[]={2, 6, 5, 8, 11};
        int k= 14;
       /* for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(Arrays.toString(new int[]{i,j}));
                    return;
                }
            }
        }
        System.out.println(Arrays.toString(new int[]{-1,-1}));*/

        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int rem = k-arr[i];
        //     if(mp.containsKey(rem)){
        //         System.out.println(Arrays.toString(new int[]{mp.get(rem),i}));
        //         return;
        //     }
        //     if(!mp.containsKey(arr[i])){
        //         mp.put(arr[i], i);
        //     }
        // }
        // System.out.println(Arrays.toString(new int[]{-1,-1}));

        //using two pointer
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==k){
                System.out.println("YES");
                return;
            }else if(arr[left]+arr[right]>k){
                right--;
            }else{
                left++;
            }
        }
        System.out.println("No");
    }
}
