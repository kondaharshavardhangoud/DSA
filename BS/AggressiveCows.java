package BS;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int arr[] ={0,3,4,7,10,9};
        int cows=4;
        System.out.println(aggressiveCows(arr,cows));
    }

   /*  private static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int n = arr.length;
         int max = arr[n-1]-arr[0];
        for(int i=1;i<=max;i++){
            if(!possible(arr,cows,i)){
               return i-1;
             }
        }
        return max;
    }
    */
    // optimal approach 
     private static int aggressiveCows(int[] arr, int cows){
            int n = arr.length;
            Arrays.sort(arr);
            int low = 1; // since minimum possible distance
            int high = arr[n-1]-arr[0];
            while(low<=high){
                int mid = (low+high)/2;
                if(possible(arr, cows, mid)==true){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
            // since starting low is possible answer 
            // and high is not possible answer
            // after binary the high <= low goes to opposite polarity so high becomes 
            // max answer
            return high;
        }

    private static boolean possible(int[] arr, int cows, int dist) {
        int startCow =1;
        int lastPlaced = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPlaced>=dist){
                startCow+=1;
                lastPlaced = arr[i];
            }
            if(startCow>=cows){
                return true;
            }
        }
        return false;
    }
}
