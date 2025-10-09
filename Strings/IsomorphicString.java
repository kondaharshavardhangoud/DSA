package Strings;

import java.util.*;

public class IsomorphicString {
    private static boolean isomorphicString(String s,String t){
        if(s.length()!=t.length()) return false;
       // Map<Character,Character> mp = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char h = s.charAt(i);
        //     char k = t.charAt(i);
        //     if(mp.containsKey(h) && mp.get(h)!=k){
        //         return false;
        //     }else{
        //         for(Map.Entry<Character,Character> entry : mp.entrySet()){
        //             if(entry.getValue()==k){
        //                 return false;
        //             }
        //         }
        //          mp.put(h, k);
        //     }
        // }
        Map<Character,Character> st = new HashMap<>();
        Map<Character,Character> ts = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char h = s.charAt(i);
           char k = t.charAt(i);
           if(st.containsKey(h) && st.get(h)!=k) return false;
           if(ts.containsKey(k) && st.get(k)!=h) return false;
           st.put(h, k);
           ts.put(k, h);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "for";
        String t = "bar";
        System.out.println(isomorphicString(s, t));
    }
}
