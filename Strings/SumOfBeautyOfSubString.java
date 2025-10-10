package Strings;

import java.util.*;

public class SumOfBeautyOfSubString {
    private static int sumOfBeautyOfSubString(String s){
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> mp = new HashMap<>();
            for(int j=i;j<n;j++){
                mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0)+1);
                    int max =Integer.MIN_VALUE;
                    int min =Integer.MAX_VALUE;
                    for(int freq : mp.values()){
                        if(freq>max) max = freq;
                        if(freq<min) min = freq;
                    }
                    int res = max - min;
                    ans += res;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "xyx";
        System.out.println(sumOfBeautyOfSubString(s));
    }
}
