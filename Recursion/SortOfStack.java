package Recursion;

import java.util.Stack;

public class SortOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(4);
        st.push(2);
        
       // Stack<Integer> result = sortedStack(st);
        sortedStack(st);
        System.out.println("Full stack :"+st.toString());
        System.out.println("Top element in descending order : "+st.peek());
    }

    // private static Stack<Integer> sortedStack(Stack<Integer> st) {
    //     Stack<Integer> temp = new Stack<>();
    //     while (!st.isEmpty()) {
    //         int current = st.pop();
    //         while (!temp.isEmpty() && temp.peek()<current) {
    //             st.push(temp.pop()); // because we need to store only greater elements in the tempstack i.e greater to smaller
    //             //if we found other greater elements then push the temp element to st
    //         }
    //         temp.push(current);
    //     }
    //     while (!temp.isEmpty()) {
    //         st.push(temp.pop());
    //     }
    //     return st;
    // }

    // Recursion method
    private static void sortedStack(Stack<Integer> st) {
         if(st.isEmpty()) return;
         int current = st.pop();
         sortedStack(st);
         insertBackToStack(st,current);
    }

    private static void insertBackToStack(Stack<Integer> st, int current) {
        if(st.isEmpty()||st.peek()<=current){
            st.push(current);
            return;
        }
         int temp = st.pop();
         insertBackToStack(st, current);
         st.push(temp);
    }
}
