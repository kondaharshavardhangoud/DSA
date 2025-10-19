package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionPowerSet {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String s="abc";
        helper(s,0,sb,result);
        System.out.println(result.toString());
    }

    private static void helper(String s, int index, StringBuilder sb, List<String> result) {
        if(index==s.length()){
            result.add(sb.toString());
            return;
        }
        helper(s, index+1, sb, result);
        sb.append(s.charAt(index));
        helper(s, index+1, sb, result);
        sb.deleteCharAt(sb.length()-1);
    }
}
