package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSetII {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        List<Integer> temp = new ArrayList();
        HashSet<String> resu = new HashSet<>();
        helper(arr,0,temp,resu);
        System.out.println(resu);
    }
    public static void helper(int arr[],int index,List<Integer> temp ,HashSet<String> resu){
        if(index==arr.length){
            resu.add(new ArrayList<>(temp).toString());
            return;
        }

        temp.add(arr[index]);
        helper(arr, index+1, temp, resu);
        temp.remove(temp.size()-1);
        helper(arr, index+1, temp, resu);
    }
}
