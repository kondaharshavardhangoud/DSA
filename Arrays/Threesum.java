package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Threesum {
    /*public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet();
        Set<Integer> mp = new HashSet<>();
        int sum =0;
        for(int i=0;i<nums.length-1;i++){
            List<Integer> lt = new ArrayList<>();
            sum = nums[i]+nums[i+1];
            int rem = -sum;
            if(mp.contains(rem)){
                lt.add(rem);
                lt.add(nums[i]);
                lt.add(nums[i+1]);
                result.add(lt);
            }
            else {
                mp.add(nums[i]);
            }
        }
        List<List<Integer>> result1 = new ArrayList<>(result);
        return result1;
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> lt = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(lt);
                    j++;
                    k--;
                    //skip duplicates
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                }
                
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        Threesum t = new Threesum();
        System.out.println(t.threeSum(arr));
    }
}
