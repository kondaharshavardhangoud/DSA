package Arrays;

import java.util.*;

public class ElementAppearsOnce {
         private static void elementAppearsOnce(int arr[]){
         for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                return;
            }
         }   
        System.out.println("None appears once");     
    }

    // using Hashing
     private static void elementAppearsOncee(int arr[]){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1) System.out.println(entry.getKey());
        }
     }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,3,99,4,2,7,7,9,9,0,0};
        elementAppearsOncee(arr);
    }
}
