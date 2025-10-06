package BS;

public class KokoEatingBananas {
    
    private static int kokoEatingBananas(int arr[],int n ,int h){
        int high = findHighInArr(arr,n);
        int low =1;
        int result =0;
        while(low<=high){
            int mid = (low+high)/2;
            int hours = totalHours(arr,mid);
            if(hours>h){
                low = mid+1;
            }if(hours<=h){
                result = mid;
                high=mid-1;
            }
        }
        return result;
    }
    private static int totalHours(int[] arr, int mid) {
       int hours =0;
       for(int k : arr){
            hours += (int)Math.ceil((double)k/mid);
       }
       return hours;
    }
    private static int findHighInArr(int[] arr,int n) {
        int high =0;
       for(int a:arr){
            if(a>high){
                high =a;
            }
       }
       return high;
    }
    public static void main(String[] args) {
        int arr[]={7, 15, 6, 3};
        int n =4;
        int h =8;
        System.out.println(kokoEatingBananas(arr,n,h));
    }
}
