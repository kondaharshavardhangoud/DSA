package Arrays;
import java.util.*;
public class RearrangeBysign {
    private static int[] rearrangeBysign(int arr[]){
        List<Integer> ltPositives = new ArrayList<>();
        List<Integer> ltNegatives = new ArrayList<>();
        for(int a : arr){
            if(a<0) ltNegatives.add(a);
            if(a>=0) ltPositives.add(a);
        }
        int k=0;
        int h=0;
        int i=0;
        while(i<arr.length){
            if(k<ltPositives.size()) arr[i++]=ltPositives.get(k++);
            if(h<ltNegatives.size()) arr[i++]=ltNegatives.get(h++);
            }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,-3,2,4,5,6};
        System.out.println(Arrays.toString(rearrangeBysign(arr)));
    }
}
