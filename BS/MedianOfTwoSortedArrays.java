package BS;

import java.util.*;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2,4,6};
        int arr2[] = {1,3};
        System.out.println(median(arr1,arr2));
    }

    //optimal solution 
    public static double median(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2 = arr2.length;
        int n = (n1+n2);
        if(n1>n2) return median(arr2, arr1);
        int left = (n1+n2+1)/2; // how many elements should present in left half
        int low =0;
        int high = n1;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2= left-mid1; // by subtracting total left elements should present - arr1 comming elements
            int l1=mid1-1>=0?arr1[mid1-1]:Integer.MIN_VALUE;
            int l2=mid2-1>=0?arr2[mid2-1]:Integer.MIN_VALUE;
            int r1 = mid1<n1?arr1[mid1]:Integer.MAX_VALUE;
             int r2 = mid2<n2?arr2[mid2]:Integer.MAX_VALUE;
             if(l1<=r2 && l2<=r1){
                if(n%2==1) return (double)Math.max(l1,l2);
                else return ((double)Math.max(l1,l2)+(double)Math.min(r1,r2))/2.0;
             }
             if(l1>r2){
                high = mid1-1;
             }else if(l2>r1){
                low = mid1+1;
             }
        }
        return 0;
    }

    /* 
    public static double median(int[] arr1, int[] arr2) {
        int n1= arr1.length;
        int n2 = arr2.length;
        int n = n1+n2;
        int ind2 = n/2;
        int ind1 = ind2-1;
        int count =0;
        int ind1ele =-1;
        int ind2ele=-1;
        int i=0;int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(count==ind1) ind1ele=arr1[i];
                if(count==ind2) ind2ele=arr1[i];
                count++;
                i++;
            }else{
                if(count==ind1) ind1ele=arr2[j];
                if(count==ind2) ind2ele=arr2[j]; 
                count++;
                j++;
            }
        }

        while(i<n1){
            if(count==ind1) ind1ele=arr1[i];
                if(count==ind2) ind2ele=arr1[i];
                count++;
                i++;
        }
        while(j<n2){
            if(count==ind1) ind1ele=arr2[j];
                if(count==ind2) ind2ele=arr2[j]; 
                count++;
                j++;
        }

        if(n%2==0) return ind1ele+ind2ele/2.0;
        else return ind2ele;
    }*/

    /*
    public static double median(int[] arr1, int[] arr2) {
         List<Integer> lt = new ArrayList<>();
         int i=0;
         int j=0;
        while(i<arr1.length && j <arr2.length){
            if(arr1[i]<arr2[j]){
                lt.add(arr1[i]);
                i++;
            }else {
                lt.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            lt.add(arr1[i]);
            i++;
        }
         while(j<arr2.length){
            lt.add(arr2[j]);
            j++;
        }
         int size = lt.size();
         if(size%2==1){
            return lt.get(size/2);
         }else{
            return (lt.get(size/2 -1)+lt.get(size/2))/2.0;
         }
    } */

}
