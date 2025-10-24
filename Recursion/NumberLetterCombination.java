package Recursion;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class NumberLetterCombination {
    private final String map[];
    NumberLetterCombination(){
        map= new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }
    public static void main(String[] args) {
        NumberLetterCombination np = new NumberLetterCombination();
        String n = "23";
        List<String> result = new ArrayList();
        np.helper(n,0,"",result);
        System.out.println(result.toString());
    }
    public void helper(String n ,int index,String temp,List<String> result){
        if(temp.length()==n.length()){
            result.add(temp);
            return;
        }
        String s = map[n.charAt(index)-'0'];
        for(int i=0;i<s.length();i++){
            helper(n, index+1, temp+s.charAt(i), result);
        }
        }
    }
