package BS;

public class SmallestDivisor {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int limit =8;
        int n =4;
        System.out.println(smallestDivisor(arr,n,limit));
    }

    private static int smallestDivisor(int[] arr, int n, int limit) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            high = (int)Math.max(high,arr[i]);
        }

        while (low<=high) {
            int mid = (low+high)/2;
            if(possible(arr,mid,limit,n)<=limit){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }

    private static int possible(int[] arr, int mid, int limit, int n) {
        int hours =0;
        for(int a : arr){
            hours += (int)Math.ceil((double)a/mid);
            if(hours>limit) return hours;
        }
        return hours;
    }
}
