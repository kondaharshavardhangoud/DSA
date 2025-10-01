package Arrays;

import java.util.*;

public class Majoritynby3 {
    /* public List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> lt = new ArrayList<>();
        for(int a : nums){
            mp.put(a,mp.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>n/3) lt.add(entry.getKey());
        }
        return lt;
    }*/ 

    public List<Integer> majorityElementTwo(int[] nums){
        List<Integer> lt = new ArrayList<>();
        int n = nums.length;
        int ele1 =0;
        int ele2=0;
        int ele1count =0;
        int ele2count =0;
        for(int num : nums){
            if(ele1 == num){
                ele1count++;
            }else if(ele2== num){
                ele2count++;
            }else if(ele1count==0){
                ele1=num;
                ele1count=1;
            }else if(ele2count==0){
                ele2=num;
                ele2count=1;
            }else{
                ele1count--;
                ele2count--;
            }
        }
        int count1 =0;
        int count2 =0;
        for(int b:nums){
            if(ele1==b) count1++;
            if(ele2==b) count2++;
        }
        int res = n/3;
        if(count1>res) lt.add(ele1);
        if(count2>res) lt.add(ele2);
        return lt;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 1, 1, 3, 3, 2,2,2,2,2};
        Majoritynby3 m = new Majoritynby3();
        System.out.println(m.majorityElementTwo(arr));
    }
}
