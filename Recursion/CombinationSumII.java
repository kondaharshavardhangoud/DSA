package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        helper(arr,0,target,temp,list);
        System.out.println(list.toString());
    }

    private static void helper(int[] arr, int start,int target,List<Integer> temp, List<List<Integer>> list) {
        if(start==arr.length){
            if(target==0){
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int j=start;j<arr.length;j++){
            if(j>start && arr[j]==arr[j-1]) continue;

            if(arr[j]>target) break;

            temp.add(arr[j]);
            helper(arr, j+1, target-arr[j], temp, list);
            temp.remove(temp.size()-1);
        
        }
        
        
    }
}
