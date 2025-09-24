package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    private static List<Integer> leaderInArray(int arr[]){
        //brute force
       /*  List<Integer> lt = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean test = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    test=false;
                }
            }
            if(test) lt.add(arr[i]);
        }
        return lt;*/

        // optimal Approach
        List<Integer> lt = new ArrayList<>();
        int max = arr[arr.length-1];
        lt.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max= arr[i];
                lt.add(max);
            }
        }
        Collections.reverse(lt);
        return lt;
    }
    public static void main(String[] args) {
        int arr[]={4, 7, 1, 0};
        System.out.println(leaderInArray(arr));
    }
}
