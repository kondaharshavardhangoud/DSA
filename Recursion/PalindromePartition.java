package Recursion;
import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static void main(String[] args) {
        String s = "aabb";
        List<String> temp = new ArrayList();
        List<List<String>> ans = new ArrayList();
        PalindromePartition p = new PalindromePartition();
        p.helper(s,0,temp,ans);
        System.out.println(ans.toString());
    }
    public void helper(String s,int index,List<String> temp,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                helper(s, i+1, temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
