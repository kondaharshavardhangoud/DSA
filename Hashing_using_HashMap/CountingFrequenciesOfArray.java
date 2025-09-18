package Hashing_using_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountingFrequenciesOfArray {
    private static List<List<Integer>> countingFrequenciesOfArray(int arr[]){
        List<List<Integer>> finalList = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : arr){
            int key = n;
            int freq =0;
            if(hm.containsKey(key)){
               freq = hm.get(key);
            }
            freq++;
            hm.put(key,freq);
        }
        int maxFreq = Integer.MIN_VALUE;
        int elementWithMaxFreq=-1;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            List<Integer> list = new ArrayList<>();
            int key = entry.getKey();
            int value = entry.getValue();
            list.add(key);
            list.add(value);
            finalList.add(list);

            if(value>maxFreq){
                maxFreq = value;
                elementWithMaxFreq=key;
            }else if(value==maxFreq){
                elementWithMaxFreq = Math.min(elementWithMaxFreq, key);
            }
        }
        System.out.println("Maximum frequency key is "+elementWithMaxFreq);
        System.out.println("Maximum number of times it appears "+maxFreq);
        return finalList;
    }
    public static void main(String[] args) {
        int arr[] ={9,4,4,4,4,4,4,0,5,5,5,5,5,5,9,3,1,2,0,6};
        List<List<Integer>> lt = countingFrequenciesOfArray(arr);
        System.out.println(lt);
    }
}
