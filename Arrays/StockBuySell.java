package Arrays;

public class StockBuySell {
    private static int stockBuySell(int arr[]){
        int diff=0;
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               int profit = arr[j]-arr[i];
               if(profit>diff){
                  diff = profit;
               }
                 }
        }
        return diff; */
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minValue = Math.min(minValue, arr[i]);
            diff = Math.max(diff, arr[i]-minValue);
        }
        return diff;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4,13};
        int k = stockBuySell(arr);
        System.out.println(k);
    }
}
