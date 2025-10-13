package LinkedList;

import java.util.Arrays;
import java.util.List;

public class OddEvenLL {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(10,2,3,1,0,5);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        Node newHead = EvenOddLL(head);
        printLL(newHead);
    }

    private static Node EvenOddLL(Node head) {
        Node oddHead = null,oddTail =null;
        Node evenHead = null,evenTail=null;
        while (head!=null) {
            Node newNode = new Node(head.data);
            if(head.data%2==0){
               if(evenHead==null){
                evenHead = newNode;
                evenTail = evenHead;
               }else{
                evenTail.next =newNode;
                evenTail = evenTail.next;
               }
            }else{
                if(oddHead==null){
                oddHead = newNode;
                oddTail = oddHead;
               }else{
                oddTail.next =newNode;
                oddTail = oddTail.next;
               }
            }
            head=head.next;
        }
        if(oddTail!=null){
            oddTail.next = evenHead;
            return oddHead;
        }else{
             return evenHead;
        }
       
        
    }

    private static void printLL(Node newHead) {
        while (newHead!=null) {
            System.out.print(newHead.data+"->");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
