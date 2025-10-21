package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[]={5,2,1};
        int n=3;
        List<Integer> temp = new ArrayList();
        List<Integer> subsetSums = new ArrayList<>();
      //  helper(arr,0,n,temp,subsetSums);
        helper(arr,0,0,subsetSums);
        Collections.sort(subsetSums);
        System.out.println(subsetSums);
    }
    // public static void helper(int arr[],int index,int size,List<Integer> temp,List<Integer> subsetSums){
    //     if(index==size){
    //         int sum =0;
    //         for(int a : temp){
    //             sum+=a;
    //         }
    //         subsetSums.add(sum);
    //         return;
    //     }
    //     temp.add(arr[index]);
    //     helper(arr, index+1, size, temp,subsetSums);
    //     temp.remove(temp.size()-1);
    //     helper(arr, index+1, size, temp,subsetSums);
        
    // }
    public static void helper(int arr[],int index,int sum,List<Integer> subSetSum){
        if(index==arr.length){
            subSetSum.add(sum);
            return;
        }
        helper(arr, index+1, sum+arr[index], subSetSum);
        
        helper(arr, index+1, sum, subSetSum);
    }
}
