package Arrays;

import java.util.*;

public class FindingRepeatingANDMissing {
    /*private static void findingRepeatingANDMissing(int arr[],int n){
        int result[] = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a : arr){
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>1) {
                result[0]=entry.getKey();
                break;
            }
        }
        int actualSum =0;
        for(int s : arr){
            actualSum+=s;
        }
        actualSum = actualSum-result[0];
        int sum = (n)*((n+1)/2);
        result[1]= sum-actualSum;
        System.out.println(Arrays.toString(result));
    }*/

    private static void findingRepeatingANDMissing(int arr[],int n){
        int s = (n*(n+1))/2;
        int s2 = (n*(n+1)*(2*n+1))/6;
        int actualSquareSum=0;
        int actualSum=0;
        for(int a : arr){
            actualSum += a;
            actualSquareSum += a*a;
        }
        int eq1 = actualSum-s;
        int eq2 = actualSquareSum-s2;

        int RplusM = eq2/eq1;

        int repeated = (eq1 + RplusM)/2;
        int  missing = repeated-eq1;
        System.out.println("Repeated : "+repeated +" : Missing : "+ missing);

    }
    public static void main(String[] args) {
        int arr[]={6, 5, 7, 1, 8, 6, 4, 3, 2};
        int size = arr.length;
        findingRepeatingANDMissing(arr,size);

    }
}
