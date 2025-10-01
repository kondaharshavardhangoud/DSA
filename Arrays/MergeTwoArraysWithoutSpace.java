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
/*public void merge(int[] nums1, int n, int[] nums2, int m) {
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
}*/

// without using extra space 
// public void merge(int[] nums1, int n, int[] nums2, int m) {
//     int left = n-1;
//     int right = 0;
//     while(left>0 && right <m-1){
//         if(nums1[left]>nums2[right]){
//             int temp = nums1[left];
//             nums1[left]=nums2[right];
//             nums2[right]=temp;
//             left--;
//             right++;
//         }else{
//             break;
//         }
//     }
//     Arrays.sort(nums1);
//     Arrays.sort(nums2);
//     System.out.println(Arrays.toString(nums1));
//       System.out.println(Arrays.toString(nums2));
// }


// second optimal solution
private void swapIfGreater(int[] nums1, int[] nums2, int ind1,int ind2){
     if(nums1[ind1]>nums2[ind2]){
        int temp = nums1[ind1];
        nums1[ind1]=nums2[ind2];
        nums2[ind2]=temp;
     }
}
public void merge(int[] nums1, int n, int[] nums2, int m) {
    int len = (n+m);
    int gap = (len/2) + (len%2);
    while(gap>0){
        int left =0;
        int right = left+gap;
        while(right<len){
            if(left<n && right>=n){
                swapIfGreater(nums1, nums2, left, right-n);
            }else if(left>=n){
                 swapIfGreater(nums2, nums2, left-n, right-n);
            }else{
                 swapIfGreater(nums1, nums1, left, right);
            }
            left++;
            right++;
        }
        if(gap == 1) break;
        gap = (gap/2)+(gap%2);
    }
}
public static void main(String[] args) {
        int num1[]={-5, -2, 4, 5,9};
        int num2[]={-3, 1, 8};
        int n = num1.length;
        int m = num2.length;
        MergeTwoArraysWithoutSpace mk = new MergeTwoArraysWithoutSpace();
        mk.merge(num1, n, num2, m);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}
