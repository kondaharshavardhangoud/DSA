package Strings;

import java.util.*;

public class SortCharByFreq {
    private ArrayList<Character> sortCharByFreq(String s){
        Map<Character,Integer> hp = new HashMap<>();
        ArrayList<Character> res = new ArrayList<>();
        for(char c : s.toCharArray()){
            hp.put(c, hp.getOrDefault(c, 0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hp.entrySet());
        Collections.sort(list,(a,b) ->{
            if(!a.getValue().equals(b.getValue()))
                return b.getValue() - a.getValue();
            return a.getKey() -b.getKey();
        });
        
        for(Map.Entry<Character,Integer> entry : list){
            res.add(entry.getKey());
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "raaaajj";
        System.out.println((new SortCharByFreq().sortCharByFreq(s)));
    }
}
