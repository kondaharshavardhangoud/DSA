package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int k =3;
        int n = 7;
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(k,n,1,temp,res);
        System.out.println(res);
    }
    public static void helper(int k,int target,int start,List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==k){
            int sum =0;
            for(int a : temp) sum+=a;
            if(sum==target) res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=9;i++){
            temp.add(i);
            helper(k, target,i+1, temp, res);
            temp.remove(temp.size()-1);
        } 
    }
}
