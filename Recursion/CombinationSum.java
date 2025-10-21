package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target =7;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        helper(arr,0,target,l1,list);
        System.out.println(list.toString());
    }

    private static void helper(int[] arr,int i, int target, List<Integer> temp, List<List<Integer>> list) {
            if (i==arr.length) {
                if(target==0){
                    list.add(new ArrayList<>(temp));
                }
                return;
            }

            if(arr[i]<=target){
                temp.add(arr[i]);
                helper(arr, i, target-arr[i], temp, list);
                temp.remove(temp.size()-1);
            }
            
            helper(arr, i+1, target, temp, list);
    }
}
