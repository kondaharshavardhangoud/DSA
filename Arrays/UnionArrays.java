package Arrays;

import java.util.*;

public class UnionArrays {
    private static Object[] unionArrays(int arr1[],int arr2[]){
        Set<Integer> lt = new TreeSet<>();
        for(int a : arr1){
            lt.add(a);
        }
        for(int b : arr2){
            lt.add(b);
        }
        return lt.toArray(); // Set to array in object form so it is returning object
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4,5,6,8};
        int arr2[]={2,3,4,5,6,7};
        System.out.println(Arrays.toString(unionArrays(arr1, arr2)));
    }
}
