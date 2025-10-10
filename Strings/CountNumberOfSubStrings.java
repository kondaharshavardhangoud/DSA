package Strings;

import java.util.*;

public class CountNumberOfSubStrings {
    private static int countNumberOfSubStrings(String s,int k){
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> mp = new HashMap<>();
            for(int j=i;j<s.length();j++){
                 mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0)+1);
                if(mp.size()==k) count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k =2;
        System.out.println(countNumberOfSubStrings(s, k));
    }
}
