package Arrays;

public class CheckArraySorted {
    private static void checkArraySorted(int arr[]){
        boolean notAscending =false;
        boolean notDescending = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) 
            {
                notAscending=true;
            }
            if(arr[i]<arr[i+1]){
                notDescending=true;
            }
        }
        if(!notAscending || !notDescending){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int arr1[]={9,8,7,5,3,1};
        int arr2[]={2,6,1,3};
        checkArraySorted(arr);
        checkArraySorted(arr2);
        checkArraySorted(arr1);
    }
}
