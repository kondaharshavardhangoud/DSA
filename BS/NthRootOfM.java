package BS;

public class NthRootOfM {
    public static void main(String[] args) {
        int n =4;
        int m =69;
        System.out.println(nthRootOfM(n,m));
    }

    private static int nthRootOfM(int n, int m) {
        int low =1;
        int high = m;
        while(low <=high){
            int mid = (low+high)/2;
           long root = nthRoot(mid,n,m);
            if(root == m) return mid;
            if(root<m){
                low =mid+1;
            }else{
                high =mid-1;
            }
        }
        return -1;
    }

    private static long nthRoot(int mid, int n,int limit) {
        long result = 1;
        for(int i=0;i<n;i++){
            result *=mid;
            if(result>limit) return result;
        }
        return result;
    }
}
