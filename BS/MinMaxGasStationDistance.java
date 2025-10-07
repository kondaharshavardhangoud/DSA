package BS;

import java.util.PriorityQueue;

public class MinMaxGasStationDistance {
    /* 
    public double minimiseMaxDistance(int[] arr, int k) {
        int newArr[] = new int[arr.length-1];
        for(int i=1;i<=k;i++){
            double maxSection = -1;
            int maxInd = -1;
            for(int j=0;j<arr.length-1;j++){
                double  diff = arr[j+1]-arr[j];
                double  sectionDiff = diff/(double)(newArr[j]+1);
                if(sectionDiff>maxSection){
                    maxSection = sectionDiff;
                    maxInd = j;
                }
            }
            newArr[maxInd]++;
        }
        double  maxAns = -1;
        for(int i=0;i<arr.length-1;i++){
            double  diff = arr[i+1]-arr[i];
            double  sectionDiff = diff/(double)(newArr[i]+1);
            maxAns = Math.max(maxAns, sectionDiff);
        }
        return maxAns;
    }
        */

        // optimized 
        public static class Pair{
            double first;
            int second;
            Pair(double first,int second){
                this.first=first;
                this.second=second;
            }
        }
        public double minimiseMaxDistance(int[] arr, int k) {
            int n = arr.length;
            int newArr[]= new int[n-1];
            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Double.compare(b.first, a.first));
            for(int i=0;i<n-1;i++){
                pq.add(new Pair(arr[i+1]-arr[i],i));
            }
            for(int i=1;i<=k;i++){
                Pair tp = pq.poll();
                int index = tp.second;
                newArr[index]++;
                double  initialDiff = arr[index+1]-arr[index];
                double  currDiff = initialDiff/(newArr[index]+1);
                pq.add(new Pair(currDiff, index));
            }
            return pq.poll().first;
        }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
        int k =9;
        System.out.println(new MinMaxGasStationDistance().minimiseMaxDistance(arr, k));
    }
}
