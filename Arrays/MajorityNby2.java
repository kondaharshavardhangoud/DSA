package Arrays;

import java.util.*;

public class MajorityNby2 {
    private static int majorityNby2(int arr[]){
        // for(int i=0;i<arr.length;i++){
        //     int count =0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //          count++;
        //     }
        //     }
        //     if(count>arr.length/2){
        //         return arr[i];
        //     }
            
        // }
         // return -1;
        // using Hashing

        /*HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
       
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;*/

       // boyer moree Voting algorithm
       int count =0;
       int ans = -1;
       for(int i=0;i<arr.length;i++){
          if(count == 0){
            ans = arr[i];
            count =1;
          }else if(arr[i]!=ans){
            count--;
          }else{
            count++;
          }
       }
       count =0;
       for(int a : arr){
           if(a==ans){
            count++;
           }
       }
       if(count>arr.length/2){
        return ans;
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]= new int[]{4,4,2,4,3,4,4,3,2,4};
        System.out.println(majorityNby2(arr));
    }
}
