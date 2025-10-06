package BS;

public class MinDaysToMakeBouquets {
    public static void main(String[] args) {
        int arr[] = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k=3;
        System.out.println(minDaysToMakeBouquets(arr,m,k));
    }

    private static int min(int arr[]){
        int min =Integer.MAX_VALUE;
        for(int m : arr){
            if(m<min) min = m;
        }
        return min;
    }
    private static int max(int arr[]){
        int max =Integer.MIN_VALUE;
        for(int m : arr){
            if(m>max) max = m;
        }
        return max;
    }

    // brute-force 
   /*  private static int minDaysToMakeBouquets(int[] arr, int m, int k) {
     if(arr.length<m*k) return -1;
      int low = min(arr);
      int high = max(arr);
      
      for(int i = low;i<=high;i++){
            if(possible(arr,i,m,k)){
                return i;
            }
        }
      return -1;
    }
    */
     private static int minDaysToMakeBouquets(int[] arr, int m, int k){
      int low = min(arr);
      int high = max(arr);
      int ans = -1;
      while (low<=high) {
        int mid = (low+high)/2;
        if(possible(arr, mid, m, k)){
            ans =mid;
            high = mid-1;
        }else{
            low = mid+1;
        }
        
      }  
      return ans;
     }
    private static boolean possible(int[] arr, int i, int m, int k) {
        int n = arr.length;
        int count =0;
        int numberOfBou =0;
        for(int j=0;j<n;j++){
            if(arr[j]<=i){
                count++;
            }else{
                numberOfBou += count/k;
                count=0;
            }
        }
        numberOfBou += count/k;
        return numberOfBou>=m;
    }
}
