package Strings;

import java.util.*;

public class RomanNumberToInteger {
    private static int romanNumberToInteger(String s){
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int ans =0;
        int i=0;
        while(i<s.length()-1){
            char c = s.charAt(i);
            char ch = s.charAt(i+1);
            if(mp.get(c)>=mp.get(ch)){
                ans += mp.get(c);
            }else{
                ans -= mp.get(c);
            }
            i++;
        }
        return ans+(mp.get(s.charAt(s.length()-1)));
       
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanNumberToInteger(s));
    }
}
