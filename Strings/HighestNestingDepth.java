package Strings;

public class HighestNestingDepth {
    private static int highestNestingDepth(String s){
        int count =0;
        int maxCount =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            if(c==')'){
                count--;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s = "(1)+((((2))))+(((3)))";
        System.out.println(highestNestingDepth(s));
    }
}
