package BS;

public class BookAllocation {
   /*  private static int bookAllocation(int arr[],int studs){
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>low) low = arr[i];
            high += arr[i];
        }

        for(int i = low;i<=high;i++){
            if(possible(arr,i,studs)==studs){
                return i;
            }
        }
        return low;

    }*/

    // optimized solution 
    private static int bookAllocation(int arr[],int studs){
        int low = 0;
        int high = 0;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>low) low = arr[i];
            high += arr[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(arr, mid, studs)<=studs){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }

    private static int possible(int[] arr, int limit, int studs) {
        int startStudent =1;
        int studentAllocated = 0;
        for(int i=0;i<arr.length;i++){
            if(studentAllocated+arr[i]>limit){
                studentAllocated = arr[i];
                startStudent++;
            }else{
                studentAllocated+=arr[i];
            }
            
        }
        return startStudent;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int students = 2;
        System.out.println(bookAllocation(arr, students));
    }
}
