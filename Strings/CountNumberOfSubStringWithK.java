package Strings;

import java.util.*;

public class CountNumberOfSubStringWithK {
    public static void main(String[] args) {
        String s ="pqpqs";
        int k =2;
        System.out.println(countNumberOfSubStringWithK(s,k));
    }

    private static int countNumberOfSubStringWithK(String s, int k) {
        return atMostK(s,k)-atMostK(s,k-1);
    }

    private static int atMostK(String s, int k) {
        int left =0;
        int right =0;
        int ans=0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=right;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
            if(mp.size()>k){
                char leftChar = s.charAt(left);
                mp.put(leftChar, mp.get(leftChar)-1);
                if(mp.get(leftChar)==0) mp.remove(leftChar);
                left++;
            }
            ans += i-left+1;
        }
        return ans;
    }
}
