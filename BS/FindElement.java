package BS;

public class FindElement {
    private static void findElement(int num,int arr[]){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==num){
            System.out.println(mid);
            break;
        }else if(arr[mid]>num){
            high = mid-1;
        }else{
             low = mid+1;
        }
        }
        System.out.println(-1);
    }

    // recursive
    private static void findElementRecursive(int num,int arr[],int low,int high){           int mid = (low+high)/2;
        if(low>high){
            System.out.println(-1);
            return; 
        } 
        if(arr[mid]==num){
            System.out.println(mid);
            return;
        }else if(arr[mid]>num){
            findElementRecursive(num, arr, low, mid-1);
        }else if(arr[mid]<num){
            findElementRecursive(num, arr, mid+1, high);
        }
        }

    public static void main(String[] args) {
        int arr[]={3, 4, 6, 7, 9, 12, 16, 17};
        int k =9;
       // findElement(k,arr);
        findElementRecursive(k, arr, 0, arr.length-1);
    }
}
