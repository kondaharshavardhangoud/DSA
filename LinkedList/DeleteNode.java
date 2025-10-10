package LinkedList;
import java.util.*;

import LinkedList.Node;;
public class DeleteNode {
    private static Node remove(Node head){
        Node temp = head;
        if(temp == null || temp.next==null){
            return null;
        }
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,1,0);
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));
        head.next.next.next.next = new Node(list.get(4));
        System.out.println("Before removing");
        printLL(head);
        System.out.println();
        System.out.println("After removing");
        Node newHead = remove(head);
        printLL(newHead);
    }
}
