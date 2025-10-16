package Recursion;

import java.util.Stack;

public class StackInReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(4);
        st.push(2);
        System.out.println("Before Reverse : "+ st.toString());
        reverseTheStack(st);
        System.out.println("After Reverse :"+st.toString());
    }

    private static void reverseTheStack(Stack<Integer> st) {
       if(st.isEmpty()) return;
       int value = st.pop();
       reverseTheStack(st);
       insertBackToStackInReverseOrder(st,value);
       
    }

    private static void insertBackToStackInReverseOrder(Stack<Integer> st, int value) {
        if(st.isEmpty()){
            st.push(value);
            return;
        }
        int temp = st.pop();
        insertBackToStackInReverseOrder(st, value);
        st.push(temp);
    }
}
