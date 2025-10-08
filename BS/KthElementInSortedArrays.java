package BS;

public class KthElementInSortedArrays {

    /* 
    public static int kthElement(int[] a, int[] b, int k) {
      int n1 = a.length;
      int n2=b.length;
      int i=0;
      int j=0;
      int count=1;
      while(i<n1 && j<n2 )
      {
        if(a[i]<=b[j]){
             if(count==k) return a[i];
            count++;
            i++;
           
        }else if(a[i]>b[j]){
             if(count==k) return b[j];
            count++;
            j++;
           
        }
      }
      while(i<n1){
         if(count==k) return a[i];
         count++;
            i++;
           
      }
      while (j<n2) {
        if(count==k) return b[j];
        count++;
            j++;
            
      }
      return 0;
    }*/

    //Optimal solution

    public static int kthElement(int[] a, int[] b, int k) {
    int n1 = a.length;
    int n2=b.length;
    if(n1>n2) return kthElement(b, a, k);
    int left = k;//left side should contain all the k elements to find easily
    int low = Math.max(0,k-n2); // because the elements of a array or if element of 
    //array a finishes the it moves and find in array b
    int high = Math.min(k,n1);
    while(low<=high){
        int mid1 = (low+high)/2;
        int mid2 = left-mid1; // remaining of left will assign from array 2
        int l1 = mid1-1>=0?a[mid1-1]:Integer.MIN_VALUE;
        int l2 = mid2-1>=0?b[mid2-1]:Integer.MIN_VALUE;
        int r1 = mid1<n1?a[mid1]:Integer.MAX_VALUE;
        int r2 = mid2<n2?b[mid2]:Integer.MAX_VALUE;
        if(l1<=r2 && l2<=r1){
            return Math.max(l1,l2);
        }
        if(l1>r2){
            high = mid1-1;
        }else if(l2>r1){
            low = mid1+1;
        }
    }
    return 0;
    }
    public static void main(String[] args) {
        int arr1[]={2, 3, 6, 7, 9};
        int arr2[]={1, 4, 8, 10};
        int k =7;
        System.out.println(kthElement(arr1,arr2,k));
    }
}
