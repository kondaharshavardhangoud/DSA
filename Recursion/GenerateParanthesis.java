package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n =3;
        List<String> result = new ArrayList<>();
        generateParanthesis(n,0,0,"",result);
        System.out.println(result.toString());
    }

    private static void generateParanthesis(int n,int open,int close, String string, List<String> result) {
       if(string.length()==n*2){
            result.add(string);
            return;
       }
      if(open<n){
        generateParanthesis(n, open+1, close, string+"(", result);
      }
        if (close < open) {
            generateParanthesis(n, open, close + 1, string + ")", result);
        }
    }
} 
