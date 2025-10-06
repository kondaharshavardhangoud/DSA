package BS;

public class FindSquareValue {
    public static void main(String[] args) {
        int n =128;
        System.out.println(findSquareValue(n));
    }

    private static int findSquareValue(int n){
        int low =0;
        int high=n;
        int ans =0;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid == n) return (int)mid;
            if(mid*mid<n){
                ans = (int) mid;
                low = (int)mid + 1;
            }else{
                high = (int)mid-1;
            }
        }
        return ans;
    }


    // TimeCOmplexity O(n)
   /*  private static int findSquareValue(int n) {
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }  */
}
