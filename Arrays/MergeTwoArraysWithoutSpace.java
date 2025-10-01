package Arrays;

import java.util.*;

public class MergeTwoArraysWithoutSpace {
    /* public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> lt = new ArrayList<>();
        for(int h : nums1){
            lt.add(h);
        }
        for(int i : nums2){
            lt.add(i);
        }
        Collections.sort(lt);
        System.out.println(lt);
    }
*/    
public void merge(int[] nums1, int n, int[] nums2, int m) {
    int num3[]= new int[n+m];
    int left =0;
    int right =0;
    int index =0;
    while(left<n && right<m){
        if(nums1[left]<=nums2[right]){
            num3[index++]=nums1[left];
            left++;
        }else if(nums2[right]<=nums1[left]){
            num3[index++]=nums2[right];
            right++;
        }
    }
    while(left<n){
        num3[index++]=nums1[left];
            left++;
    }
    while(right<m){
        num3[index++]=nums2[right];
            right++;
    }

    for(int i=0;i<m+n;i++){
        if(i<n){
            nums1[i]=num3[i];
        }else{
            nums2[i-n]=num3[i];
        }
        
    }
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
}
public static void main(String[] args) {
        int num1[]={-5, -2, 4, 5};
        int num2[]={-3, 1, 8};
        int n = num1.length;
        int m = num2.length;
        MergeTwoArraysWithoutSpace mk = new MergeTwoArraysWithoutSpace();
        mk.merge(num1, n, num2, m);
    }
}
