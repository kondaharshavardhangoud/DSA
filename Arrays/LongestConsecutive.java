package Arrays;

import java.util.Arrays;
import java.util.*;

public class LongestConsecutive {
    // private static boolean linearSearch(int arr[],int num){
    //     int n = arr.length;
    //     boolean k = false;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==num){
    //             k=true;
    //         }
    //     }
    //     return k;
    // }
    // private static int longestConsecutive(int arr[]){b
    //     int maxLen=1;
    //     for(int i=0;i<arr.length;i++){
    //         int count =1;
    //        int x = arr[i];
    //         while(linearSearch(arr, x+1)==true){
    //             x=x+1;
    //             count =count+1;
    //         }
    //         if(count>maxLen){
    //             maxLen=count;
    //         }
    //     }
    //     return maxLen;
    // }

    private static int longestConsecutiveBetter(int arr[]){
        int maxLen =1;
        int count=0;
        int smallest = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            if(arr[i]-1 == smallest){
                count ++;
                smallest = arr[i];
            }else if(arr[i]-1!=smallest){
                count =1;
                smallest =arr[i];
            }
           maxLen= Math.max(count, maxLen);
        }
        return maxLen;
    }

    public static int longestConsecutive(int[] nums) {
        int longest =1;
        int smallest = Integer.MIN_VALUE;
        Set<Integer> s = new HashSet<>();
        for(int a : nums){
            s.add(a);
        }
        for(int b : nums){
            int count =0;
            if(!s.contains(b-1)){
                smallest=b;
                count =1;
                while(s.contains(smallest+1)){
                    count++;
                    smallest+=1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,6,5,9,0,0,0};
       // System.out.println(longestConsecutive(arr));
        System.out.println(longestConsecutive(arr));
    }
}
