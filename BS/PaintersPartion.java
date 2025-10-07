package BS;

public class PaintersPartion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int m = 2;
        System.out.println(paintersPartion(arr, m));
    }

  /*   private static int paintersPartion(int[] arr, int m) {
        int low =0;
        int high = 0;
        for(int a : arr){
            if(a>low) low = a;
            high+=a;
        }
        for(int i =low;i<=high;i++){
            if(possible(arr,i,m)<=m){
                return i;
            }
        }
        return -1;
    }*/

    // Optimal solution
    private static int paintersPartion(int[] arr, int m) {
        int low =0;
        int high = 0;
        int ans = 0;
        for(int a : arr){
            if(a>low) low = a;
            high+=a;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(arr, mid)<=m){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    private static int possible(int[] arr, int i) {
        int numberOfPainters =1;
        int sum =0;
        for(int a : arr){
            if(sum+a>i){
                numberOfPainters++;
                sum = a;
            }else{
                sum+=a;
            }
        }
        return numberOfPainters;
    }
}
