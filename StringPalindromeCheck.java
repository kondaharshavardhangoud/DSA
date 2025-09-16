public class StringPalindromeCheck {
    // Doesn't work for Spaces in between
    private static boolean stringPalindromeCheck(String st){
        String lower= st.toLowerCase();
        String reversedString = new StringBuilder(lower).reverse().toString();
        return lower.equals(reversedString);
    }

    // Works for spaces as well
    private static boolean stringPalindromeCheckSpace(String st){
        String newSt = st.toLowerCase();
        int left=0;
        int right=newSt.length()-1;
        while(left<=right){
            if(newSt.charAt(left)==' '){
                left++;
                continue;
            } 
            if(newSt.charAt(right)==' ') {
                right--;
                continue;
            }
            if(newSt.charAt(left)!=newSt.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
     //   System.out.println(stringPalindromeCheck("Racecar"));
        System.out.println(stringPalindromeCheckSpace("hahahahahaHA hahahahah"));
    }
}
