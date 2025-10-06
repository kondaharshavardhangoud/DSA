package BS;
public class KthMissingPositive {
   /*  private static int kthMissingPositive(int arr[],int k){
        int current =1;
        int missingCount =0;
        int i=0;
        while (true) {
            if(current==arr[i]){
                i++;
            }else{
                missingCount++;
                if(missingCount==k) return current;
            }
            current++;
        }
    }*/

   /* private static int kthMissingPositive(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) return k++;
            else break;
        }
        return k;
    }*/ 

    //optimized 
    private static int kthMissingPositive(int arr[],int k){
        int low =0;
        int high=arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        if (high == -1) return k;
        int actualMissing = arr[high]-(high+1);
        return arr[high]+k-actualMissing;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6};
        int k = 4;
        System.out.println(kthMissingPositive(arr,k));
    }
}
