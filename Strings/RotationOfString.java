package Strings;

public class RotationOfString {
    private static boolean rotationOfString(String s,String goal){
        if(s.length()!=goal.length()) return false;
        String demo = s+s;
        if(demo.contains(goal)){
            return true;
        }else{
          return  false; 
    }
}
    public static void main(String[] args) {
        String  s = "rotation", goal = "tionrota";
        boolean res = rotationOfString(s, goal);
        System.out.println(res);
    }
}
