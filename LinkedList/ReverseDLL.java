package LinkedList;

import java.util.Arrays;
import java.util.List;

import LinkedList.DoubleNode;
public class ReverseDLL {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,4);
    DoubleNode head = new DoubleNode(list.get(0));
    DoubleNode prev = head; // storing head in prev so that we can add new data
    for(int i =1;i<list.size();i++){
        DoubleNode temp = new DoubleNode(list.get(i),prev,null);
        prev.next = temp;
        prev = temp;
        
    }
    System.out.println("Before");
    printDouble(head);
    System.out.println("After");
    DoubleNode newHead = reverse(head);
    printDouble(newHead);
    }
    private static DoubleNode reverse(DoubleNode head) {
        DoubleNode current = head;
        DoubleNode back =null;
        while(current!=null){
            back = current.prev;//stores current previous in prev
            current.prev=current.next; // reversing the links
            current.next=back; 
            current = current.prev;
        }
        return back!=null?back.prev:null;
        
    }
    private static void printDouble(DoubleNode head) {
        System.out.print("null<->");
        while (head!=null) {
            System.out.print(head.data+"<->");
            head = head.next;
        }
         System.out.println("null");
    }
}
