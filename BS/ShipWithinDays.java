package BS;

public class ShipWithinDays {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days =5;
        System.out.println(shipWithinDays(arr,days));
    }
// optimal approach 
 public static int shipWithinDays(int[] weights, int days) {
       int ans =-1;
       int max = Integer.MIN_VALUE;
       int totalSum =0;
       for(int a : weights){
           max = (int)Math.max(a, max);
            totalSum += a;
       }
       int low = max;
       int high= totalSum;
       while(low<=high){
        int mid = (low+high)/2;
        if(findDays(weights,mid)<=days){
            ans = mid;
            high = mid -1;
        }else{
            low = mid+1;
        }
       }
       return ans;
    }

// Brute_Force
 /*    public static int shipWithinDays(int[] weights, int days) {
       int max = Integer.MIN_VALUE;
       int totalSum =0;
       for(int a : weights){
           max = (int)Math.max(a, max);
            totalSum += a;
       }
       int low = max;
       int high= totalSum;

       for(int i=low;i<=totalSum;i++){
          if(findDays(weights,i)<=days){
             return i;
          }
       }
       return -1;
    }
       */
    private static int findDays(int[] weights, int i) {
        int days =1;
        int capacityCanHoldinDay =0;
        for(int a : weights){
            if(capacityCanHoldinDay+a>i){
                days +=1; 
                capacityCanHoldinDay=a;
            }else{
                 capacityCanHoldinDay += a;
            }
        }
        return days;
    }
}
